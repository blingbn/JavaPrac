package com.test;

public class Airplane implements Flyer {//인터페이스구현

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙==========");
	}

	@Override
	public void fly() {
		System.out.println("Airplane 날아==========");
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙==========");
	}

}
