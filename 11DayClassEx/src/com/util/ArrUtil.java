package com.util;

import com.model.Student;

public class ArrUtil {
	//배열을 도와주는 util 클래스
	
	public Student[] changeName(Student[] stuarr){
			for(Student s : stuarr) {
				s.setName(s.getName()+"학생");
			}
			//System.out.println(names);
		return stuarr;//리턴값과 함수의 타입은 같아야함.
	}
	
	
	
	
	//이름으로 검색 - 해당학생반환
	public Student searchByName(Student[] stuarr, String name) {
		
		System.out.println("name : " + name);
		Student result = null;
		for(Student s : stuarr) {
			if(name.equals(s.getName())) {
				result = s;
			}
		}return result;
	}
	
	
	
	//최고나이 반환
	public Student maxAge(Student[] stuarr) {
		Student max = stuarr[0];
		for(Student s : stuarr) {
			if(max.getAge()<=s.getAge()) {
				max=s;
			} 
		}return max;
		
		/*
		if(max<stuarr[1].getAge()) {
			max = stuarr[1].getAge();
		}else if(max<stuarr[2].getAge()) {
			max = stuarr[2].getAge();
		}
		*/
		
	}
	
	
	
	//학생 한명의 데이터를 출력하는 함수
	public void stuAPrint(Student stu) {
		System.out.println(stu.getName() + " " + stu.getAge()+ " " +stu.getAddr());
	}
	
	//배열 생성, 메인으로 배열을 반환시키기
	public Student[] createArr(){//배열을 만들어서 반환하기
		
		Student stu1 = new Student("홍길동", 10, "서울");
		Student stu2 = new Student("강감찬", 20, "수지");
		Student stu3 = new Student("유관순", 10, "경기");
		
		//배열에 학생객체를 저장 후 출력
		Student[] stuarr = new Student[3];
		stuarr[0] = stu1; // 홍길동
		stuarr[1] = stu2; // 강감찬
		stuarr[2] = stu3; // 유관순
		
		return stuarr;
	}
	
	public void ArrPrint(Student[] arr) {//배열을 받아와서 전체 내용을 출력
		
		for(Student s : arr) {
			System.out.println(s.getName());
		}
	};
	
	//학생의 이름을 "홍길동/유관순/강감찬"으로 반환함수
	//함수이름 getNames(){}
	
	public String getNames(Student[] arr){
		String names = "";
			for(Student s : arr) {
				names+=s.getName()+"/";
			}
			//System.out.println(names);
		return names;//리턴값과 함수의 타입은 같아야함.
	}
	
	
}
