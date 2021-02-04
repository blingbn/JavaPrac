package com.dao;

import java.util.HashSet;

import com.service.OracleService;

public class OracleMain {

	public static void main(String[] args) {
		OracleService service = new OracleService();
		
		HashSet<String> xxx = service.select(); //1번작업 , 5번작업의 연장선
		
		System.out.println(xxx);
	}

}
