package com.test;
//import java.lang*; //자동으로 추가됨
public class Ex08_9 {

	public static void main(String[] args) {
		
		
		//오토방식
		int num = 10;
		Integer num2 = num; //자동오토방식
		//integer num2 = new Integer(num)과 동일 -> 자동으로 JDK 실행
		
		//비교연산자
		System.out.println(num == num2);//오토언박싱 후 비교
		//num3 = num2.intValue();
		//System.out.println(num==num3);
		
		Integer num3 = new Integer(200);
		int num4 = num3;
		
		System.out.println(num3 > 100);
		
		

	}

}
