package com.test;

public class TestPerson {

	
	
	
	public static void main(String[] args) {
		
		Person p = new Person("홍길동", 20);
		
		p.setName("이순신");
		p.setAge(40);
		String name = p.getName();
		int age = p.getAge();
		
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
		
		
		
		
	}

}
