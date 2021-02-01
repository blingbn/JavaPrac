package com.test;


class Employee{
	//세금구하기
	public void taxRate(Employee e) {
		if(e instanceof Manager) {//부모 자식순 비교하지말고 자식 -> 부모순 뒤로 갈수록 부모
			Manager m = (Manager)e; 
			System.out.println("Manager 세금 구하기");
			m.print();//((Manager)e).print();
		}else if (e instanceof Engineer) {
			Engineer en = (Engineer)e; // ((Engineer)e).test();
			((Engineer)e).test();
			System.out.println("Engineer 세금 구하기");

		}else if (e instanceof Employee) {
			Employee en = (Employee)e;
			System.out.println("Employee 세금 구하기");
		}
	}
}

class Manager extends Employee{
	public void print() {
		System.out.println("printttttt");
	} //유일함수
}
class Engineer extends Employee{
	public void test() {
		System.out.println("Engineer testttttt");
	} // 유일함수
	
}

public class Ex06_8 {

	public static void main(String[] args) {
//		Employee emp = new Employee();
//		Manager man = new Manager();
//		Engineer eng = new Engineer();
		
//		emp.taxRate(emp);
//		emp.taxRate(man);
		
		
		Employee emp = new Employee();
		Employee eng = new Engineer();
		emp.taxRate(eng);

	}

}
