package com.one;

import java.util.ArrayList;
import java.util.List;

class Person{
	String name="홍길동";
};
class Man extends Person{
	String male="M";
	
	@Override
	public String toString() {
		return "Man [male=" + male + ", name=" + name + "]";
	}
	
};
class Woman extends Person{
	String male="F";

	@Override
	public String toString() {
		return "Woman [male=" + male + ", name=" + name + "]";
	}
};
public class GenericTest3 {
	public static void printData(List<?extends Person> list) {
		for(Object x: list) {
			System.out.println(x);
		}
	}
	public static void printData2(List<? super Person> list) {
		for(Object x: list) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Man> list2=new ArrayList<>();
		list2.add(new Man());
		list2.add(new Man());
		//list2.add(new Woman());
		List<Woman> list3=new ArrayList<>();
		list3.add(new Woman());
		list3.add(new Woman());
		list3.add(new Woman());
		List<Person> list4=new ArrayList<>();
		list4.add(new Man());
		list4.add(new Woman());
		List<String> list= new ArrayList<>();
		list.add("Test");
		//printData(list);
		printData(list2);
		printData(list3);
		printData(list4);
		
		//printData2(list2);
		//printData2(list3);
		printData2(list4);
		
 		
	}

}
