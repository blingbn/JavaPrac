package com.test;

public class Bird implements Flyer {//인터페이스구현

	@Override
	public void takeOff() {
		System.out.println("Bird 이륙==========");
	}

	@Override
	public void fly() {
		System.out.println("Bird 날아==========");
	}

	@Override
	public void land() {
		System.out.println("Bird 착륙==========");
	}

}
