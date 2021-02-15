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
	
}
