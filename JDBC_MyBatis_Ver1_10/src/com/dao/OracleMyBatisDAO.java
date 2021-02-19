package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public OracleMyBatisDAO() {
		super();
	}


	public void multiUpdate(SqlSession session, List<Integer> deptnoes) {
		session.update("com.dept.DeptMapper4.multiUpdate", deptnoes);
	}

	
	public List<Dept> multiSelect(SqlSession session, List<Integer> deptnoes) {
		List<Dept> list = session.selectList("com.dept.DeptMapper4.multiSelect", deptnoes);
		return list;
	}


	public void multiInsert(SqlSession session, List<Dept> deptnoes3) {
		session.insert("com.dept.DeptMapper4.multiInsert", deptnoes3);
	}

}
