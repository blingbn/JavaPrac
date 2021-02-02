package com.test;

import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) throws Exception{

		//숫자 -> String : format
		DecimalFormat df = new DecimalFormat("$###,###,###");
		String mesg = df.format(987654321);
		System.out.println(mesg);
	}

}
