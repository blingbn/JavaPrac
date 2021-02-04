package com.dao;

import java.util.HashSet;

public class OracleDAO { //자료 3번
	public HashSet<String> select(){
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		return set; //service로 return 4번작업
	}
}
