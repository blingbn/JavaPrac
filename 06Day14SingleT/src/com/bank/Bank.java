package com.bank;

public class Bank {
	
	private static Bank b = new Bank(); //2. static 변수로 자신의 클래스를 객체생성
	private String name;
	
	
	private Bank() {} //1. 생성자를 public -> private으로
	
	public static Bank getBank() {//3. 생성된 객체를 필요한 곳에 리턴시키는 static get 메소드 작성
		return b;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		

	}

}
