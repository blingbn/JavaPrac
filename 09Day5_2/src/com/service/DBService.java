package com.service;
import com.dao.DBDAO;

public class DBService {
	
	DBDAO dao;
	public void setDAO(DBDAO dao) {//매개변수 INTERFACE
		this.dao = dao;
		this.dao.connect();
	}
	public void insert() {
		dao.insert();
	}
}
