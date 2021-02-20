package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	
	public OracleMyBatisDAO() {
		super();
	}

	public int insert(SqlSession session, Dept dept) {
		
		int num = session.insert("deptInsert", dept); //insert 호출(id, insert할 데이터(이경우엔 객체 통째로))
		System.out.println("추가된 레코드 ===== " + num);
		return num;
	}
	
	
	public List<Dept> selectAll(SqlSession session){
		List<Dept> list = session.selectList("selectAll");
		return list;
	}

	public Dept selectByDeptno(SqlSession session, int deptno) /*2. throws RecordNotFoundException */{
		Dept dept = session.selectOne("selectByDeptno", deptno);
		
		//1. exception
		try {
			if(dept==null) throw new RecordNotFoundException(deptno+"부서가 없습니다.");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return dept;
	}

	public int update(SqlSession session, Dept dept) {
		int num = session.update("deptUpdate", dept);
		return num;
	}

	public int delete(SqlSession session, int i) {
		int num = session.delete("deptDelete", i);
		return num;
	}
	
	
	
}