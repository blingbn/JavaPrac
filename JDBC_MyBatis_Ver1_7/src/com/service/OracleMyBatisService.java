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



	public List<Dept> selectDynamicByDeptno(HashMap<String, Integer> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectDynamicByDeptno(session, map);
		}finally {
			session.close();
		}
		return list;
	}




}
