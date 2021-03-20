package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.dao.OracleDAO;


public class OracleService {
	OracleDAO dao;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	
	public OracleService() {
		dao = new OracleDAO();
		try {
			Class.forName(driver);
			System.out.println("드라이버연결");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public int insert(int deptno, String dname, String loc) {
		
		int num = 0;
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			num = dao.insert(con, deptno, dname, loc);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
				try {
					if (con != null)con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return num;
	}	
}

