package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleDAO { // db접속을 위해 드라이버로딩, 커넥션 등
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
	
		public OracleDAO() {// 기본생성자
			super();
			try {
				Class.forName(driver); // 위 멤버변수 사용
				System.out.println("driver실행");
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}

		public ArrayList<Dept> select() throws SQLException {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("driver실행");
			ArrayList<Dept> list = new ArrayList<Dept>();
			String sql = "select deptno x, dname, loc from dept";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString(2);
				String loc = rs.getString("loc");
				Dept dto = new Dept(deptno, dname, loc);
				list.add(dto);
			}
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (con != null)
				con.close();
			return list;
		}//ends OracleDAO()

		
		public int insert(Dept xx) {
			Connection con = null;
			PreparedStatement pstmt= null;
			int num = 0;
			try {
				con = DriverManager.getConnection(url, userid, passwd);
				String sql = "insert into dept(deptno, dname, loc)" + "values(?,?,?)";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, xx.getDeptno());
				pstmt.setString(2, xx.getName());
				pstmt.setString(3, xx.getLoc());
				num = pstmt.executeUpdate();
				System.out.println("실행결과 : " + num);
			} catch (Exception e) {
				e.printStackTrace();
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
			return num;
			}

		public void delete(int i) {
			Connection con = null;
			PreparedStatement pstmt= null;
			
			try {
				con = DriverManager.getConnection(url, userid, passwd);
				String sql = "delete from dept where deptno=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, i);
				int num = pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
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

		public void update(Dept xx) throws RecordNotFoundException { //xx에서 데이터뽑기, update쿼리 실행 후 update건수 출력, update건수가 0인경우 레코드없음 -> RecordNotFoundException 발생
			Connection con = null;
			PreparedStatement pstmt= null;
			
			try {
				con = DriverManager.getConnection(url, userid, passwd);
				String sql = "update dept set dname=?, loc=? where deptno=? ";
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, xx.getName());
				pstmt.setString(2, xx.getLoc());
				pstmt.setInt(3, xx.getDeptno());
				int num = pstmt.executeUpdate();
				
				if(num==0){
					throw new RecordNotFoundException(xx.getDeptno()+"레코드가 없음");
				}else {
					System.out.println("실행 결과"+num);
				}
			} catch (Exception e) {
				e.printStackTrace();
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

