package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleTXDAO;
import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTXService {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	OracleTXDAO dao;
	
	public OracleTXService() {
		super();
		dao = new OracleTXDAO();
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<Dept> select() throws SQLException {
		Connection con = null;
		ArrayList<Dept> list= null;	
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			list = dao.select(con);
			
		} finally{
			if(con != null) con.close();
		}
		return list;
	}
	public void insert(Dept xx) {
		Connection con=null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.insert(con,xx);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update(Dept xx2) throws RecordNotFoundException {
		Connection con=null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.update(con,xx2);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
	
	public void delete(int i) {
		Connection con = null;
	
		
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			dao.delete(con, i);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void insertDelete(Dept dept, int i) {
		Connection con = null;
		ArrayList<Dept> list = null;
		try { //con 닫기
			con = DriverManager.getConnection(url, userid, passwd);
con.setAutoCommit(false); //자동반영 false = > 명시적 commit, rollback
			dao.insert(con, dept); //추가
			dao.delete(con, i); //삭제 => exception 발생시킬것
con.commit(); //두작업에 문제가 없을 경우 commit
System.out.println("==========commit 완료");
		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			if(con!=null) 
//				try{
//				System.out.println("rollback=======================");
//con.rollback(); //문제발생시 rollback
//				}catch(SQLException e1) {
//					e1.printStackTrace();
//				}
		}finally {
			if(con!=null) 
				try{
					//con.setAutoCommit(true); close시킬경우 안필요함. tx의 종료 자동반영으로 변경
				con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
		}	
	}
}
