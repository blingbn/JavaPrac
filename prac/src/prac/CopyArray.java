package prac;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		
		
		/*
		int[] arr = new int[5]; // 길이 5인 arr 배열 선언 + 생성
		int[] tmp = new int[arr.length*2]; //새로운 배열인 tmp에 arr배열의 2배길이 대입
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i]=arr[i];
			arr = tmp;
			
		}System.out.println(Arrays.toString(tmp));
		*/
		
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		
		//System.out.println(abc);
		//System.out.println(num);
		
		//배열 abc와 num을 붙여서 하나의 배열(result)을 만든다.
		char[] result = new char[abc.length+num.length]; // 길이 14인 배열생성
		System.arraycopy(abc, 0, result, 0, abc.length); 
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		

	}

}
