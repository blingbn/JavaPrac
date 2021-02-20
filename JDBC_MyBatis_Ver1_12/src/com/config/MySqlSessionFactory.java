package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	
	static SqlSessionFactory sqlSessionFactory =null;
	static {
		String resource = "Configuration.xml";
		InputStream inputStream= null;
	
		try {
			inputStream = Resources.getResourceAsStream(resource);
			//configuration.xml 읽어오기 성공
		}catch(IOException e){
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//초기화 성공
	}
	public static SqlSession getSqlSession() {
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}
}
