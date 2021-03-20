package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleDAO {


	public int insert(Connection con, int deptno, String dname, String loc) {
		PreparedStatement pstmt =null;
		int num = 0;
		try {

			String sql="insert into dept (deptno,dname,loc)"
					+ " values ("+deptno+",'"+dname+"','"+loc+"')";
			 pstmt = con.prepareStatement(sql);

			num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수:" + num);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return num;
	}
}
