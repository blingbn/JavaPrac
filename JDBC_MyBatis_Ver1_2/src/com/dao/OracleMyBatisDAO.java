package com.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.dto.Dept;

public class OracleMyBatisDAO {
	
	public OracleMyBatisDAO() {
		super();
	}

	public void insert(SqlSession session, Dept dept) {
		
		int num = session.insert("deptInsert", dept); //insert 호출(id, insert할 데이터(이경우엔 객체 통째로))
		System.out.println("추가된 레코드 ===== " + num);
		
	}
	
	
	public List<Dept> selectAll(SqlSession session){
		List<Dept> list = session.selectList("selectAll");
		return list;
	}
	
	
	
}