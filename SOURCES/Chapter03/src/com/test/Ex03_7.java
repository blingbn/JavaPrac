package com.test;

public class Ex03_7 {

	public static void main(String[] args) {
		// 비교연산자 + 논리연산자
		
		int x = 10;
		int y = 15;
		
		System.out.println(x > 5 && x < 25); // T
		System.out.println(x > 8 && y < 10); // F
		

		System.out.println(x > 15 || x < 25); // T
		System.out.println(x > 8 || y < 25); // T
		
			

	}

}
