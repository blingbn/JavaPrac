package com.xxx;

import java.util.Random;

public class Student {

	public String name = "홍길동";
	public void a() {
		Random r= new Random();
		System.out.println("com.xxx.Student ========" + r.nextInt(10)+1); //1~10
	}

}