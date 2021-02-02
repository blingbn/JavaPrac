package com.test;

import java.util.StringTokenizer;

public class Ex08_16 {

	public static void main(String[] args) {
		String mesg = "홍길동, 이순신, 유관순";
		
		StringTokenizer st = new StringTokenizer(mesg, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}
