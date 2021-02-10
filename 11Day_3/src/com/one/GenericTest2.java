package com.one;

import java.util.ArrayList;
import java.util.List;

public class GenericTest2 {
	public static void printData(List<?> num) {
		for(Object p: num) {
			System.out.println(p);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String > list= new ArrayList<>();
		list.add("홍길동1");
		list.add("홍길동2");
		list.add("홍길동3");
		list.add("홍길동4");
		 printData(list);
		 List<Integer> list2 = new ArrayList<>();
		 list2.add(10);
		 list2.add(20);
		 list2.add(30);
		 
		 printData(list2);
		 
		
	}

}
