package com.test;

public class Ex03_8 {

	public static void main(String[] args) {
		// Short circuit operation 
		
		String name = null;
		//System.out.println((4 < 2) && name.length() == 4);
		//System.out.println((4 > 2) && name.length() == 4);
		
		//오류(error)  -1). 컴파일에러 : 이클립스 창에 모두 표시 됨 // 문법오류
		//			 -2). runtime error : 문법오류가 아닌 실행시에 발생하는 논리 오류
		//System.out.println((4 < 2) || name.length() == 4);
		//System.out.println((4 > 2) || name.length() == 4);

	}

}
