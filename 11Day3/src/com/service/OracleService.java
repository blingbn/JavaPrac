package com.service;

import java.util.HashSet;

import com.dao.OracleDAO;

public class OracleService {
	
	
	OracleDAO dao;
	public OracleService(){
		dao = new OracleDAO();
	}
	
	public HashSet<String> select() {
		HashSet<String> xxx = dao.select();//dao의 필요함수호출 결과받기 2번 dao호출
		return xxx; // main으로 반환
	}

}