package com.test;

public class Ex03_9 {

	public static void main(String[] args) {
		// 3항 연산자
		
		
		int a = 12;
		int b = 4;
		int c = 19;
		
		int max = (a > b)? a: b;
		System.out.println(max); // a 출력 
		
		max = ( max > c )? max : c;
		System.out.println("최대값은 " + max); // c 출력 
		
		
		

	}

}
