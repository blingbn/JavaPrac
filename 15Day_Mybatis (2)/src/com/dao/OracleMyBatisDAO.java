package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		
		List<Dept> list = session.selectList("selectAll");
		
		return list;
	}

	public void insert(SqlSession session, Dept dept) {
		
		int n =session.insert("deptInsert",dept);
		
	}

}



