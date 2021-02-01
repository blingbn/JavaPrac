package com.service;
import com.dao.MySQLDAO;

public class DBService {
	
	MySQLDAO dao;
	public void setDAO(MySQLDAO dao) {
		this.dao = dao;
		this.dao.connectMySQL();
	}
	public void insert() {
		dao.insert();
	}
}
