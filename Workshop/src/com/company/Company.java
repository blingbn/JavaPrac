package com.company;

public class Company {
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	
	public Company() {	}
	public Company(double salary, double income, double afterTaxIncome, double bonus, double afterTaxBonus) {
		super();
		this.salary = salary;
		this.income = income;
		this.afterTaxIncome = afterTaxIncome;
		this.bonus = bonus;
		this.afterTaxBonus = afterTaxBonus;
	}


	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getIncome() {
		
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getAfterTaxIncome(double afterTaxIncome) {
		
		return afterTaxIncome;
	}
	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public double getAfterTaxBonus(double afterTaxBonus) {
		return afterTaxBonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	
	

	
}
