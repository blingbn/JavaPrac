package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public OracleMyBatisDAO() {
		super();
	}
	
	public int multiDelete(SqlSession session, List<Dept> depts) {
		int num = session.delete("com.dept.DeptMapper4.multiDelete", depts);
		return num;
	}
	
	public void multiUpdate(SqlSession session, List<Integer> deptnoes) {
		session.update("com.dept.DeptMapper4.multiUpdate", deptnoes);
	}

	public List<Dept> multiSelect(SqlSession session, List<Integer> deptnoes) {
		List<Dept> list = session.selectList("com.dept.DeptMapper4.multiSelect", deptnoes);
		return list;
	}

	public int multiInsert(SqlSession session, List<Dept> depts2) {
		int num = session.insert("com.dept.DeptMapper4.multiInsert", depts2);
		return num;
	}

	public List<Dept> selectAll(SqlSession session) {

		List<Dept> list = session.selectList("com.dept.DeptMapper.selectAll"); // Mapper2 실행 됨
		return list;
	}
	
public int insert(SqlSession session, Dept dept) {
		
		int num = session.insert("com.dept.DeptMapper.deptInsert", dept); //insert 호출(id, insert할 데이터(이경우엔 객체 통째로))
		System.out.println("추가된 레코드 ===== " + num);
		return num;
	}
	
}
