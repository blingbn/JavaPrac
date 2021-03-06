package com.test;

public class Ex03_9 {

	public static void main(String[] args) {
		// 3항 연산자
		
		/*
		int a = 12;
		int b = 4;
		int c = 19;
		
		int max = (a > b)? a: b;
		System.out.println(max); // a 출력 
		
		max = ( max > c )? max : c;
		System.out.println("최대값은 " + max); // c 출력 
		
		
		int num = 10;
		String result = (num > 0)? "큼" : "작음";
		System.out.println(result);
		
		//연습
		
		int a1 = 10;
		int b1 = 20;
		String max1 = (a1>b1)? "a":"b";
		System.out.println(max1);

		//연습2 세 수중 큰값을 저장
		int i = 10;
		int r = 20;
		int max2 = 30;
		
		int result1 = (i>r)? i : r;
		int result2 = (result1> max2)? result1 : max2;
		System.out.println(result2);
		
		*/
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		int result = (a > b)? ((a > c)? a : c) : ((b > c)? b : c);
		System.out.println(result);
	}

}
