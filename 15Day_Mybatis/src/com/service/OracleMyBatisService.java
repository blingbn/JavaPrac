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
	}

}
