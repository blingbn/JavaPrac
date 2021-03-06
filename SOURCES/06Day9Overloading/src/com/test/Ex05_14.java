package com.test;

public class Ex05_14 {

		
		int num = 5;
		public void methodA() {
			int num = 4; //로컬 - 함수호출생성, 사용, 함수종료시 삭제
			System.out.println("methodA:" + num);//로컬
			System.out.println("methodA:" + this.num);//멤버
		}

		public static void main(String[] args) {
			Ex05_14 test = new Ex05_14();
			test.methodA();
			test.num = 10; //멤버변수수정
			test.methodA();
			int num = 3;
			//int num = 5;
			//System.out.println("main:" + num);
	}

}
