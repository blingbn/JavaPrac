package prac;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		/*
		 int sum=0;
		 
		float average = 0f;
		
		int[] score = {100,88,100,100,90};
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		average = sum/(float)score.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
		*/
		
		/*
		int sum=0;
		float avg=0;
		int[] score = {100,88,100,100,90};
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		avg = sum / (float)score.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		*/
		
		
		/*
		//최댓값과 최솟값
		
		int[] score = {79,88,91,33,100,55,95};
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max<score[i]) {
				max = score[i];
			}else if(min>score[i]) {
				min = score[i];
			}
		}System.out.println("최대값은 "+ max + " 최소값은 " + min + "입니다.");
		
		*/
		
		//길이가 10인 배열 numArr을 생성하고 0~9의 숫자로 차례대로 초기화하여 출력
		
		int[] numArr = new int[10];
		for(int i=1; i<numArr.length; i++) {
			numArr[i] = i; //배열 0~9의 숫자로 초기화
		}System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n =(int)(Math.random()*10);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}System.out.println(Arrays.toString(numArr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
