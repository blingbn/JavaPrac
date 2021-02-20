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

	public Dept selectByDeptno(HashMap<String, Integer> map) {
			SqlSession session = MySqlSessionFactory.getSqlSession();
			Dept dept = null;
			try {
				dept = dao.selectByDeptno(session, map);
			}finally {
				session.close();
			}
			return dept;
		}

}
