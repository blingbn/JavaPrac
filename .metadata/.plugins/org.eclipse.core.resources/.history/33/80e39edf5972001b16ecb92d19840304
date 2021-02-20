package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;


public class OracleMyBatisDAO {
	
	public OracleMyBatisDAO() {
		super();
	}

	public List<Dept> selectDynamicByDeptno(SqlSession session, HashMap<String, Integer> map) {
		//System.out.println(map);
		List<Dept> list = session.selectList("com.dept.DeptMapper2.selectDynamicByDeptno", map);
		return list;
	}


	
}

