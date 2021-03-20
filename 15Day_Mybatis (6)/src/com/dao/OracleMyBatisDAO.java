package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		
		// id값만 사용하지 말고  namespace.id 형식 권장
		List<Dept> list = session.selectList("com.dept.DeptMapper.selectAll");
		
		return list;
	}

	public void insert(SqlSession session, Dept dept) {
		
		int n =session.insert("com.dept.DeptMapper.deptInsert",dept);
		
	}

	public void update(SqlSession session, Dept dept) {
		
		int n = session.update("com.dept.DeptMapper.deptUpdate", dept); 
		
	}

	public void delete(SqlSession session, int deptno) {
		
		int n =session.delete("com.dept.DeptMapper.deptDelete", deptno);
		
	}

	public Dept selectByDeptno(SqlSession session, int deptno) {
		Dept dept = session.selectOne("com.dept.DeptMapper.selectByDeptno", deptno);
		return dept;
	}

	public int deptRecordCount(SqlSession session) {
		
		int num= session.selectOne("deptRecordCount");
		return num;
	}
	public HashMap selectByDeptnoHashmap(SqlSession session, int deptno) {
		HashMap map= 
				session.selectOne("com.dept.DeptMapper2.selectByDeptnoHashmap", deptno);
		return map;
	}

	public List<Dept> selectByHashmap(SqlSession session,
			HashMap<String, Integer> map) {
		List<Dept> list = 
				session.selectList("com.dept.DeptMapper2.selectByHashmap",map);
		
		return list;
	}
}



