package prac;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		//1. 배열복사
		String[] str = {"홍길동", "이순신", "유관순"};
		String[] str2 = Arrays.copyOf(str, str.length);
		System.out.println(Arrays.toString(str2));
		for(String name : str2) {
			System.out.println("이름 : " + name);
		}
		
		//2. 특정값으로 모두 채우기
		int[] num = {10,20,30};
		Arrays.fill(num, 100);
		for(int nums : num) {
			System.out.println(nums);
		}
		
		//3. 특정값으로 일부분 채우기
		String[] fruits = {"사과", "배", "수박", "바나나"};
		Arrays.fill(fruits, 0, 2, "딸기");
		System.out.println(Arrays.toString(fruits));
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
		//4. 배열 비교
		String[] p = {"홍길동", "이순신", "유관순"};
		String[] p2 = {"홍길동", "이순신", "유관순"};
		System.out.println(Arrays.equals(p, p2));
		
		
		//5. 정수형 정렬
		int[] num2 = {22, 1, 3, 5, 2, 4};
		Arrays.sort(num2);
		for(int rnum : num2) {
			System.out.print(rnum+" ");
		}
		
		System.out.println();
		
		//6. 문자열 정렬
		String[] name2 = {"홍길동", "이순신", "유관순"};
		Arrays.sort(name2);
		for(String names : name2) {
			System.out.println(names);	
		}
		
		
		//7. INDEX찾기
		String[] s = {"홍길동", "이순신", "유관순"};
		int index = Arrays.binarySearch(s, "이순신");
		System.out.println("이순신의 순번은 : "+index);
	}

}
