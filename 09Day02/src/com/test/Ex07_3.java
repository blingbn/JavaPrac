package com.test;

interface Vehicle{
	public abstract void speed();
	public default void start() {
		System.out.println("start~");
	}
	public static void stop() {
		System.out.println("stop~");
	}
}

class Car implements Vehicle{

	@Override
	public void speed() {
		System.out.println("100km");
		
	}
}

public class Ex07_3 {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.speed();
		Vehicle.stop();
	}
}
