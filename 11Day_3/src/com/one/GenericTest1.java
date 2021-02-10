package com.one;

import java.util.Date;

class Box<T>
{
	T obj;
	public Box() {
		
	}
	public Box(T obj) {
		this.obj= obj;
	}
	public void setValue(T obj) {
		this.obj= obj;
	}
	public T getValue() {
		return obj;
	}
}
public class GenericTest1 {
	
	public static void main(String args[]) {
//	Box<String> t1= new Box("hello");
//	System.out.println(t1.getValue());
//	Box<Date> t2= new Box(new Date());
//	System.out.println(t2.getValue());
	Box<String> t1= new Box<String>();
	t1.setValue("hello");
	System.out.println(t1.getValue());
	Box<Date> t2= new Box<Date>();
	t2.setValue(new Date());
	System.out.println(t2.getValue());
	Box<Integer> t3= new Box<>();
	t3.setValue(100);
	//t3.setValue("100");
	System.out.println(t3.getValue());
	
	
	
	}

}
