package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlsessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMyBatisDAO dao;
	
	public OracleMyBatisService() {
		dao =new OracleMyBatisDAO();
	}

	public List<Dept> selectAll() {
		SqlSession session = MySqlsessionFactory.getSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);//jdbc버전의 con 전달과 비슷
		}finally {
			session.close();
		}
		return list;
	}//end select

	public void insert(Dept dept) {
		SqlSession session = MySqlsessionFactory.getSession();
		try {
			dao.insert(session,dept);
			session.commit();  //명시적으로 
		}finally {
			session.close();
		}
		
	}//end insert

}
