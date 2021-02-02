package com.time;
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12,35,30);
		System.out.println(t);
		t.setHour(t.getHour()+1);
		System.out.println(t);
		System.out.println(t.toString()); //toString 메소드로 위와 같이 출력가능
	}

}
