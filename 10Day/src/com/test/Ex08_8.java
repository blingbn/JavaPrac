package com.test;

public class Ex08_8 {

	public static void main(String[] args) {
		//1. 기본형을 Wrapper로 변경
		int num = 10;
		Integer x = new Integer(num);
		
		//2. Wrapper을 기본형으로 변경
		int x2 = x.intValue();
		
		
		Object[] obj = {10, "홍길동", 3.14, true, 'A'};
		for(int i = 0; i<obj.length; i++) {
			System.out.println(obj[i]);
		}
		for(Object o : obj) {
			System.out.println(o);
		}
	}

}
