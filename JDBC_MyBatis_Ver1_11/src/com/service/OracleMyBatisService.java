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
	/*
	public void multiUpdate(List<Integer> deptnoes) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		try {
			dao.multiUpdate(session, deptnoes);
			session.commit();
		}finally {
			session.close();
		}
	}
	*/
	
	
	public int insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int num=0;
		try {
			num = dao.insert(session, dept);
			session.commit(); //명시적으로 꼭 commit해주어야함.
		} finally {
			session.close();
		}
		return num;
	}
	
	
	
	
	
	public int multiDelete(List<Dept> depts) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int num = 0;
		try {
			num = dao.multiDelete(session, depts);
			session.commit();
		}finally {
			session.close();
		}
		return num;
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
