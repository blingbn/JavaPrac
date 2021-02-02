package com.test;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";
		
		StringTokenizer st = new StringTokenizer(data, "/ ,");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("======================");
		
		//1. String의 split();
		String[] d = data.split("/");
		for(String s : d) {
			System.out.println(s);
		}

	}

}
