package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTXDAO {
	
	
	public ArrayList<Dept> select(Connection con) throws SQLException {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Dept> list = new ArrayList<Dept>();
	
		String sql = "select * from dept";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			int deptno = rs.getInt(1);
			String dname = rs.getString(2);
			String loc = rs.getString(3);	
			Dept dept = new Dept(deptno, dname, loc);
			list.add(dept);
				
		}
					
		if(rs != null)rs.close();
		if(pstmt != null)pstmt.close();
			
			
		
		return list;
		
	}
	public void insert(Connection con, Dept xx) {
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into dept(deptno, dname, loc)"+"values(?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, xx.getDeptno());
			pstmt.setString(2,xx.getDname());
			pstmt.setString(3,xx.getLoc());
			
			int num = pstmt.executeUpdate();
			System.out.println("실행결과"+num);
		} catch (SQLException e){
			e.printStackTrace();
		}finally {
			try {
				if(pstmt != null)
					pstmt.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public void update(Connection con, Dept xx2) throws RecordNotFoundException{
		PreparedStatement pstmt = null;
		try {
			String sql = "update dept set  dname = ?, loc = ? where deptno=?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, xx2.getDname());
			pstmt.setString(2, xx2.getLoc());
			pstmt.setInt(3, xx2.getDeptno());
			int num = pstmt.executeUpdate();
			System.out.println("실행 결과 " + num);
			if(num==0){
				throw new RecordNotFoundException(xx2.getDeptno()+"레코드가 없음");
			}else {
				System.out.println("실행 결과"+num);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void delete(Connection con,int i) {
			PreparedStatement pstmt= null;
			
			try {
				String sql = "delee from dept where deptno=?";
				//String sql = "delete from dept where deptno=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, i);
				int num = pstmt.executeUpdate();
				System.out.println("실행 결과"+num);
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
				if(con!=null) 
					try{
					System.out.println("rollback=======================");
	con.rollback(); //문제발생시 rollback
					}catch(SQLException e1) {
						e1.printStackTrace();
					}
			} finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}	
		}
}
