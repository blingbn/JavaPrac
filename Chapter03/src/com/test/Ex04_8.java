package com.test;

import java.util.Iterator;

public class Ex04_8 {

	public static void main(String[] args) {
		//FOR문
		
		/*
		for (int n =1; n <= 10; n++) {
			System.out.println(n + "Hello World");
		}
		System.out.println("for문을 빠져나옴");
		*/
		
		/*
		for(int i = 10; i > 0; i-- ){
			System.out.println(i);
		}
		*/
		/*
		int sum = 0;
		int count = 0;
		// 1부터 100까지 증가 for문
		for(int i = 1; i<=100; i++) {
			
			sum = sum+i; // sum+=i
			count++;
			//System.out.println(i);
		}System.out.println(sum);
		System.out.println(count);
		*/
		
		/*
		//1-10까지 짝수 덧셈, 홀수만 덧셈, 홀수 + 짝수로 총합, 평균값-반복횟수
		int odd = 0;
		int even = 0;
		int total =0;
		int counter = 0;
		
		for(int i = 1; i<=10; i++) {
			if(i%2 == 0) {
				even+=i;
			}else {
				odd+=i;
			}
			total=odd+even;
			counter++;
		}
		System.out.println(total);
		System.out.println(total/counter);
		*/
		
		int total = 0;
		for(int n =1; n<=10; n+=2) {
			total += n;
		}
		System.out.println("총 합계는 " + total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
