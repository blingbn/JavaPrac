package com;

import java.util.Date;

class Box{
	Object obj;

	public void setValue(Object obj) { //매개변수로 모든 객체 받기 가능
		this.obj = obj; 
	}
	public Object getValue() { //리턴도 모든객체 가능
		return obj; 
	}
}
	
public class GenericTest {

	public static void main(String[] args) {
		Box b = new Box();
		b.setValue("hello");
		String x = (String)b.getValue(); //Obj -> Sring 형변환 후 사용
		
		Box b2 = new Box();
		b2.setValue(new Date());
		Date d=(Date)b2.getValue(); //obj -> Date로 형변환
		
		Box b3 = new Box();
		b3.setValue(100); //오토박싱 Integer
		b3.setValue(100);
		b3.setValue(100);
		b3.setValue("aaa");
		System.out.println(b3.getValue());
	}

}
