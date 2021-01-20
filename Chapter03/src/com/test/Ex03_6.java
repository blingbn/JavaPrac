package com.test;

public class Ex03_6 {

	public static void main(String[] args) {
		// 논리연산자
		
		
		boolean a = true;
		boolean b = false;
		
		System.err.println(a && a); // T
		System.err.println(a && b); // F
		System.err.println(b && a); // F
		System.err.println(b && b); // F
		
		
		System.err.println(a || a); // T
		System.err.println(a || b); // T
		System.err.println(b || a); // T
		System.err.println(b || b); // F
		

		System.err.println(!a); // F
		System.err.println(!b); // T
		
		
		
		

	}

}
