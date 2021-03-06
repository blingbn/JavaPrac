package com.test2;


class Employee {
	String name;
	int salary;

	public String getEmployee() {
		return name + " " + salary;
	}
	public Employee() {
		// super();//Object 부모클래스 객체 자동 생성
		System.out.println("Employee 기본 생성자 호출 =================");
	}
	public Employee(String name, int salary) {
		super(); //object클래스 생성
		System.out.println("Employee 매개변수 2개짜리 생성자 호출 =================");
		this.name = name;
		this.salary = salary;
	}
}// class Employee end
class Manager extends Employee {
	String depart;
	public Manager() {
		super(); // 부모의 기본생성자 호출
		System.out.println("Manager 기본생성자 호출 ==================");
	}
	public Manager(String name, int salary) {
		super(name, salary); 
	}
	public String getManager() {
		//return name + " " + salary + " " + depart;
		//return getEmployee() + " " + depart;//getEmployee
		return super.getEmployee() + " " + depart; //부모의 함수 호출
	}
	public Manager(String name, int salary, String depart) {
		//super();
		super(name, salary); //부모의 매개변수2개짜리 생성자를 호출 
		System.out.println("Manager 생성자 호출 3개짜리 =================");
		/*
		this.name = name;
		this.salary = salary;
		*/ // 부모생성자에서 설정하여 따로 설정할 필요가 없음. super(name, salary)가 이미 부르고 위에서 반환함
		this.depart = depart;
	}
}
public class Ex06_3 {
	public static void main(String[] args) {
		//Employee emp = new Employee("홍길동", 2000); // Employee 2개 짜리 생성자 
		Manager man = new Manager("이순신", 4000, "개발"); //
		//System.err.println(emp.getEmployee());
		System.err.println(man.getManager());
	}
}

