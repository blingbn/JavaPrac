package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO { //SqlSession을 받아서 dto로 만든다음 list에 넣어주는 작업
	
	public OracleMyBatisDAO() {
		//안적어도 기본생성자 생성되어있음
	}
	public List<Dept> selectAll(SqlSession session) {
		
		List<Dept> list = session.selectList("selectAll"); // ID를 적어서 호출 -> DeptMapper -> DeptMapper를 사용할 수 있는곳은 Confifuration
		//select할 경우 Mapper를 호출하는 함수가 2가지가 있음. selectOne(결과가 1개인 경우), selectList(결과가 여러개인경우)
		//selectList는 반환타입이 List<Dept> 이므로 변수를 만들어서 담아야함.
		return list;
	}

}
