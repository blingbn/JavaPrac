package com.test;

public class WrapperTest {

	public static void main(String[] args) {
		
		int num = 10;//기본형
		//WrapperClass : Integer, Double, Char...
		
		Integer objnum = new Integer(10);//WrapperClass Integer Wrapper객체생성
		//10이 기본형이 아닌 Integer가 됨 (객체 10)
		
		System.out.println(objnum.MAX_VALUE);
		String strnum = objnum.toString();
		//Wrapper 10은 연산이 안되었음.
		int pdtnum = objnum.intValue(); //객체 10값을 int 10으로 변형해서 연산
		System.out.println(pdtnum);
		
		System.out.println(pdtnum+200);
		/*
		Object[] test = new Object[3];
		test[0] = new Integer(10);
		//Object타입의 변수에 int는 저장이 안되서 Wrapper클래스로 만들어 저장했던 방식 - 옛날방식
		*/
		
		//오토방식 : int -> WrapperClass
		//언방식 : WrapperClass -> int
	}

}
