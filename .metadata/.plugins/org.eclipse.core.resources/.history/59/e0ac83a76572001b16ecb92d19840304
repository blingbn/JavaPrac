package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;


public class OracleMyBatisDAO {
	
	public OracleMyBatisDAO() {
		super();
	}


	public List<Dept> selectDynamicChoose(SqlSession session, HashMap<String, String> map) {
		
		List<Dept> list = session.selectList("com.dept.DeptMapper3.selectDynamicChoose", map);
		
		return list;
	}


	
}

