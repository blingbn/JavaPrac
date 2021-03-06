package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleMyBatisDAO {
	
	public OracleMyBatisDAO() {
		super();
	}
	//selectAll
	public List<Dept> selectAll(SqlSession session){
		
		List<Dept> list = session.selectList("com.dept.DeptMapper2.selectAll"); //Mapper2 실행 됨
		return list;
	}

	//insert
	public int insert(SqlSession session, Dept dept) {
		
		int num = session.insert("com.dept.DeptMapper.deptInsert", dept); //insert 호출(id, insert할 데이터(이경우엔 객체 통째로))
		System.out.println("추가된 레코드 ===== " + num);
		return num;
	}
	
	//selectByDeptNo
	public Dept selectByDeptno(SqlSession session, int deptno) /*2. throws RecordNotFoundException */{
		Dept dept = session.selectOne("com.dept.DeptMapper.selectByDeptno", deptno);
		//1.
		try {
			if(dept==null) throw new RecordNotFoundException(deptno+"부서가 없습니다.");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return dept;
	}
	
	public int deptRecordCount(SqlSession session) {
		int num = session.selectOne("com.dept.DeptMapper2.deptRecordCount");
		return num;
	}
	

	//update
	public int update(SqlSession session, Dept dept) {
		int num = session.update("com.dept.DeptMapper.deptUpdate", dept);
		return num;
	}

	//delete
	public int delete(SqlSession session, int i) {
		int num = session.delete("com.dept.DeptMapper.deptDelete", i);
		return num;
	}
	
	
	
	
	
	
}
