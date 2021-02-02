
package com.test;

class Outer{
	int a = 10;
	private int b = 20;
	static int c = 30;
	
	class Inner{
		int d = 40;
		//static int e = 50; // static 변수 사용 불가
		public void print() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
	}//end Inner
	public void info() {
		Inner inner = new Inner(); // 내부에서 Inner 객체 생성 접근시
		inner.print();
	}
}


public class Ex07_4 {

	public static void main(String[] args) {
		Outer outer = new Outer(); // 참조변수 생성 아래 Inner 객체 직접 사용시 사용
		outer.info(); 
		
		Outer.Inner inner = outer.new Inner(); // 외부에서 접근하여 직접 사용시 
		inner.print();

	}

}
