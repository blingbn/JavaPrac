package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public OracleMyBatisDAO() {
		super();
	}

	public void multiInsert(SqlSession session, List<Dept> depts2) {
		session.insert("com.dept.DeptMapper4.multiInsert", depts2);
	}

	public List<Dept> selectAll(SqlSession session) {

		List<Dept> list = session.selectList("com.dept.DeptMapper4.selectAll"); // Mapper2 실행 됨
		return list;
	}

}
