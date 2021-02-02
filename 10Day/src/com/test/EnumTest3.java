package com.test;

public class EnumTest3 {

	public enum Color {
		BLUE, RED, YELLOW
	}

	public static void main(String[] args) {
		Color c = Color.BLUE;
		Color c2 = Color.RED;
		Color c3 = Color.YELLOW;
		System.out.println(c);

		Color[] xx = Color.values();
		for (Color p : xx) {
			System.out.println(p);
			System.out.println(p.name() + " " + p.ordinal());
		}
	}

}
