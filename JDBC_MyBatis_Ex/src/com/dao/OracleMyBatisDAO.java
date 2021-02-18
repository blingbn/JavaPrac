package com.dao;

import java.util.HashMap;
import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;


public class OracleMyBatisDAO {
	
	public OracleMyBatisDAO() {
		super();
	}

	public Dept selectByDeptno(SqlSession session, HashMap<String, Integer> map) {
		Dept dept = session.selectOne("selectByDeptno", map);
		return dept;
	}


	
}

