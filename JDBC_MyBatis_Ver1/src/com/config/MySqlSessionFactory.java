package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder; //mybatis.jar에 있는 파일들

public class MySqlSessionFactory {
	
	//config안에는 구성요소들 작성
	
	//static 초기화
	static SqlSessionFactory sqlSessionFactory =null;
	static {
		String resource = "Configuration.xml"; //MyBatis 설정파일
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);//Configuration.xml을 읽어 올 수 있도록 java io연결
			System.out.println("초기화 Configuration.xml 등록성공");
		} catch (IOException e) {//IOException 발생은 파일경로나 이름이 틀린 경우가 대부분 
			e.printStackTrace();		
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//sqlSessionFactory을 만들어주는 sqlSessionFactory 생성
		//sqlSession을 생성하는 공장객체
	}
	//SqlSession 반환 ex)SqlSession session = MySqlSessionFactory.getSqlSession()
	public static SqlSession getSqlSession() { //connection과 비슷한 sql을 사용할 수 있도록 하는 객체-개발자가 사용하는 객체
		SqlSession session = sqlSessionFactory.openSession(); //SqlSessionFactory에서 SqlSession 생성리턴
		return session;
	}
	
	
}
