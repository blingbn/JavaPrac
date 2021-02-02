package com.test;

public class Test {

	public static void main(String[] args) {
		
		
		Test t = new Test();
		t.aaa();
		t.bbb();
		t.ccc();
	}
	
	private void ccc() {
		long start = System.currentTimeMillis();
		String x = "";
		for(int i = 0; i<10000; i++) {
			x = x.concat("aaaaaaaaaaaaa");
		}
		System.out.println("x.length():"+x.length());
		System.out.println("ccc():"+(System.currentTimeMillis()-start));
	}
	
	private void bbb() {
		long start = System.currentTimeMillis();
		StringBuffer x  = new StringBuffer();
		for(int i = 0; i<10000; i++) {
			x = x.append("aaaaaaaaaaaaa");
		}
		System.out.println("x.length():"+x.length());
		System.out.println("bbb():"+(System.currentTimeMillis()-start));
	}

	private void aaa() {
		long start = System.currentTimeMillis();
		String x = "";
		for(int i = 0; i<10000; i++) {
			x +="aaaaaaaaaaaaa";
		}
		System.out.println("x.length():"+x.length());
		System.out.println("aaa():"+(System.currentTimeMillis()-start));
	}
}
