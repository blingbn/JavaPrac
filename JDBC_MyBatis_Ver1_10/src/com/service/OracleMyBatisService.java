package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {
	
	OracleMyBatisDAO dao;
	
	public OracleMyBatisService() {
		super();
		dao = new OracleMyBatisDAO();
	}



	
	public void multiUpdate(List<Integer> deptnoes) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiUpdate(session, deptnoes);
			session.commit();
		}finally {
			session.close();
		}
	}
	
	
	
	
	
	public List<Dept> multiSelect(List<Integer> deptnoes2) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.multiSelect(session, deptnoes2);
		}finally {
			session.close();
		}
		return list;
	}



	



	




}
