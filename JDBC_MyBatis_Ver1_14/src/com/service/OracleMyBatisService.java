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
	
	public List<Dept> selectTopN(int i, int j) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectTopN(session, i, j);
		} finally {
			session.close();
		}
		return list;
	}
	
	public List<Dept> selectTopN(String loc, int i, int j) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectTopN(session, loc, i, j);
		} finally {
			session.close();
		}
		return list;
	}
	
	
	
	
	
	public String getDate() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		String day = null;
		try {
			day = dao.getDate(session);
		}finally {
			session.close();
		}
		return day;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public void multiInsert(List<Dept> depts2) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiInsert(session, depts2);
			session.commit();
		}finally {
			session.close();
		}
	}

	
	public List<Dept> selectAll(){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}return list;
	}

	

	

	
	



}