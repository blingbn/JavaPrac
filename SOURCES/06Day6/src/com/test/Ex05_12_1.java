package com.test;

public class Ex05_12_1 {
	
	
	
	public static void change(int num) {//static은 클래스로딩 -> static로딩 -> main실행 
		//static함수, 변수클래스, 클래스함수 : 클래스이름.함수이름, 클래스이름.변수이름으로 사용가능 new필요 x
		num = 20;
	}
	
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println("기본데이터 변경전 " + num);
		change(num); //기본형 데이터를 함수에 매개변수로 전달시 값을 복사(다른변수에 저장)
		System.out.println("기본데이터 변경전 " + num);
		//Ex05_13.change(num); 클래스이름.static함수이름 이것도사용가능
	}

}
