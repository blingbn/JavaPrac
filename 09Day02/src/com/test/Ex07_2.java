package com.test;

public class Ex07_2 {

	public static void main(String[] args) {
		/*
		Bird bird = new Bird(); 
		bird.fly();//오버라이딩 함수 호출
		Flyer bird2 = new Bird(); //객체생성 가능, 다형성 적용
		bird2.fly();
	
		Airplane air = new Airplane();
		air.fly(); // 오바라이딩 함수 호출
		Flyer air2 = new Airplane();
		air2.fly();
		*/
		
	
		Flyer[] arr = new Flyer[3];
		arr[0] = new Bird();
		arr[1] = new Airplane();
		arr[2] = new Bird();
		
		
		for(Flyer a : arr) {
			a.fly(); //오버라이딩 함수 호출, 유일한 메소드/변수 사용시 형변환 후 사용 
		}
		
		
	}

}
