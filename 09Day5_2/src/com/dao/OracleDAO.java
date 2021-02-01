package com.dao;
public class OracleDAO implements DBDAO {
	
	@Override
	public void connect() {
		//DB와 Java언어 연동 - MyDBMS연동해서 sql실행하기 위한 클래스
		System.out.println("OracleDAO.connect========");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}
}
