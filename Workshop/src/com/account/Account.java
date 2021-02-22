package com.account;

public class Account {
	
	String account;
	int balance;
	double interestRate;
	
	
	public Account() { } //기본생성자 생


	public Account(String account, int balance, 
			double interestRate) {//클래스 변수 생성자 생성 
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public double calculateInterest() {
		return balance*interestRate;
	}
	
	public void deposit(int money) {
		balance+=money;
	}
	public void withdraw(int money) {
		if(balance<money) {
			System.out.println("잔액이 부족하여 출금할 수 없습니다.");
		}else {
			balance-=money;			
		}
	}


	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
	
	
}
