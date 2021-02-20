package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	static SqlSessionFactory sqlSessionFactory = null; 
	static {
		String resource = "Configuration.xml";
		InputStream inputstream=null;
		try {
			inputstream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputstream);
	}
	 public static SqlSession getSqlSession() {
		 SqlSession session = sqlSessionFactory.openSession();
		 return session;
	 }

}
