package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {
	
	OracleMyBatisDAO dao;
	
	public OracleMyBatisService() {
		super();
		dao = new OracleMyBatisDAO();
	}
	public List<Dept> selectAll(){
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		}finally {
			session.close();
		}return list;
	}

	
	
	//insert
		public int insert(Dept dept) {
			SqlSession session = MySqlSessionFactory.getSqlSession();
			int num=0;
			try {
				num = dao.insert(session, dept);
				session.commit(); //명시적으로 꼭 commit해주어야함.
			} finally {
				session.close();
			}
			return num;
		}
		
		//selectByDeptNo
		public Dept selectByDeptno(int deptno) {
			SqlSession session = MySqlSessionFactory.getSqlSession();
			Dept dept = null;
			try {
				dept = dao.selectByDeptno(session, deptno);
				
			}
			/*2. 
			catch(RecordNotFoundException e){
				System.out.println(e.getMessage());
			}
			*/
			finally {
				session.close();
			}
			
			return dept;
		}
		
		//update
		public int update(Dept dept) {
			SqlSession session = MySqlSessionFactory.getSqlSession();
			int num=0;
			try {
				num = dao.update(session, dept);
				session.commit();
			}finally {
				session.close();
			}
			return num;
		}
		
		//delete
		public int delete(int i) {
			SqlSession session = MySqlSessionFactory.getSqlSession();
			int num=0;
			try {
				num = dao.delete(session, i);
				session.commit();
			}finally {
				session.close();
			}
			return num;
		}
		public int deptRecordCount() {
			SqlSession session = MySqlSessionFactory.getSqlSession();
			int num=0;
			try {
				num = dao.deptRecordCount(session);
				
			}finally {
				session.close();
			}
			return num;
		}
		
		//HashMap
		public HashMap selectByDeptnoHashMap(int deptno) {
			SqlSession session = MySqlSessionFactory.getSqlSession();
			HashMap map = null;
			try {
				map = dao.selectByDeptnoHashMap(session, deptno);
			}finally {
				session.close();
			}
			return map;
		}
		public List<Dept> selectByHashMap(HashMap<String, Integer> map) {
			SqlSession session = MySqlSessionFactory.getSqlSession();
			List<Dept> list = null;
			try {
				list = dao.selectByHashMap(session, map);
			}finally {
				session.close();
			}
			return list;
		}
		
}
