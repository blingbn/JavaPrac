package com.test;

interface Flyer{
	public abstract void takeOff();
	public abstract void fly();
	public void land();
}


public class Ex07_7 {

	public static void main(String[] args) {
		Flyer f = new Flyer(){
			public void fly() {
				System.out.println("fly");
			}//메소드 표현
			@Override
			public void takeOff() {		
				System.out.println("takeOff");
			}
			@Override
			public void land() {
				System.out.println("land");
			}
		};
		f.fly();
	}

}
