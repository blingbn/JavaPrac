package com.test3;

public class Test {

	public static void main(String[] args) {
		
		
		//Employee e = new Employee("이순신", 200);
		//System.out.println(e.getEmployee());
		//Manager m = new Manager("홍길동", 100, "영업부");
		
		//System.out.println(m.getEmployee()); //overrding된 재정의 된 함수를 호출
		Engineer eng = new Engineer("aaa",100, 200);
		String data = eng.getEmployee();
		System.out.println(data);
		
		Employee eng1 = new Engineer("aaa",100,200); //부모 = 자식객체를 저장 : 다형성
		
		System.out.println(eng1.getEmployee()); // 자식함수 호출 : new한 객체는 자식이므로 
		
		
		
	}

}