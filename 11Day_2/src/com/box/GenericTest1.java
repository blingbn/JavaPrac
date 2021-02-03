package com.box;

class Box<T>{
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	public T getValue(){
		return obj;
	}
}//end Box


public class GenericTest1 {

	public static void main(String[] args) {
		
		//제네릭스타입 (generics type)
		
		Box<String> b = new Box<String>();
		b.setValue("hello");
		//b.setValue(100); //다른타입사용불가
		String x = b.getValue();//형변환 불필요
	}

}
