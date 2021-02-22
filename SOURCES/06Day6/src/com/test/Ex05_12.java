package com.test;

public class Ex05_12 {
	
	
	public void change(int num) {
		num = 20;
	}
	
	
	public static void main(String[] args) {
		Ex05_12 t = new Ex05_12();
		
		int num = 10;
		System.out.println("기본데이터 변경전 " + num);
		t.change(num); //기본형 데이터를 함수에 매개변수로 전달시 값을 복사(다른변수에 저장)
		System.out.println("기본데이터 변경전 " + num);

	}

}
