package com.test;


final class A {}
//class AA extends A {}

class B{
	public final void print() {}
}

class BB extends B{
	//public void print(){}
}

class C {
	public static final int NUM = 100;
}
public class Ex05_23 {
	
	public static void main(String[] args) {
		System.out.println(C.NUM);

	}

}
