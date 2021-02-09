package com.test;

public class DeptDAO { //실제 DB연동 클래스 - select, insert, delete, update - 함수별로 구현
	
	//1. 4가지 정보 - 멤버변수로 선언 ( 각각 넣을 필요없이 전역변수처럼 사용)
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	
	
	public DeptDAO() {//기본생성자
		super();
		
		try {
			Class.forName(driver); //위 멤버변수 사용
			System.out.println("driver 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
