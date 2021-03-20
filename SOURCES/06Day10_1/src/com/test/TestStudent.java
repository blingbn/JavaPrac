package com.test;

public class TestStudent {

	public static void main(String[] args) {


		//1. 홍길동 / 20 / 서울, 이순신/30/제주 강감찬/40/경기 생성 배열에 저장
		
		Student [] arr = new Student[3];
		arr[0] = new Student("홍길동",20,"서울");
		arr[1] = new Student("이순신",30,"제주");
		arr[2] = new Student("강감찬",40,"경기");
		/*
		for(Student s : arr) {
			System.out.println(s);
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for(Student s : arr) {
			System.out.println(s);
		}
		*/
		//3. 홍길동인사람 출력
		
		for(Student s : arr) {
			if(s.getName().equals("홍길동"))
			System.out.println(s.getName()+"\t"+s.getAddress());
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getName().equals("홍길동")) {
				//Student stu = arr[i];
				// System.out.println(s.getName()+"\t"+s.getAddress());
				System.out.println(arr[i].getName()+"\t"+arr[i].getAddress() );
			} 
		}
		
		//4. 나이가 제일 많은 사람 출력
		/*
		int max = arr[0].getAge();
		for(int i = 1; i<arr.length;i++) {
			
			if(max<arr[i].getAge()) {
				max=arr[i].getAge();
			}
		}System.out.println("최대값은 " +max);
		
		*/
		
		
		Student max = null;
		max = arr[0];
		for(Student s : arr){
			if(max.getAge()<s.getAge())
				max = s;
		}System.out.println(max);
	}

}