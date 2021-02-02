package com.test;

import java.text.NumberFormat;

public class NumberFormatTest {

	public static void main(String[] args) {
		
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //현재지역화폐양식 
		String mesg = nf.format(987654321);
		System.out.println(mesg);

	}

}
