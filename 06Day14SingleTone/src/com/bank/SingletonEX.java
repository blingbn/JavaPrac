package com.bank;

class Singleton {
	private Singleton(){}
	
	private static Singleton singleton = new Singleton();
	
	static Singleton getInstance() {
		return singleton;
	}
}
	
	
	
public class SingletonEX{
	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
	
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
	}
}