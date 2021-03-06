package com.test;

public class Ex03_5 {

	public static void main(String[] args) {
		//page. 53
		
		int a = 3;
		++a; // a = 1 + a
		System.out.println(a); 
		
		a--; // a = a - 1
		System.out.println(a); 
		
		int x = 5;
		int y = ++x; // y = 6, x = 6 
		System.out.println(x + " " + y);
		
		int x2 = 5;
		int y2 = x2++; // y2 = 5, x2 = 6
		System.out.println(x2 + " " + y2);
	}

}
