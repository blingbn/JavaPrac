package com.bank;

public class BankTest {

	public static void main(String[] args) {
		
		Bank bank1 = Bank.getBank();
		Bank bank2 = Bank.getBank();
		
		System.out.println(bank1);
		System.out.println(bank2);
	}

}
