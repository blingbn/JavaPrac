package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.OracleDAO;
import com.dto.Dept;

public class OracleService {
	OracleDAO dao;
	
	public OracleService() {
		dao = new OracleDAO(); //2.
	}
	
	public ArrayList<Dept> select() throws SQLException{ //dept테이블 전체 레코드 리턴 //sqlexception은 메인으로가서 try catch로 잡아야함 
		//dao.select() 결과 받아서 리턴
		ArrayList<Dept> list = dao.select();//4.
		return list;
	}

	public int insert(Dept xx) {
		
		return dao.insert(xx);
	
		
	}

	public void delete(int i) {
		dao.delete(i);		
	}

	public void update(Dept xx2) {
		dao.update(xx2);
		
	}
}

