package com.account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	
	
	public Account() {	}
	public Account(String account, int balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		return this.balance*this.interestRate;
	}
	public void deposit() {
		
		this.getBalance()+
	}
	public void withdraw() {
		
		this.balance-
		
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
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	
}
