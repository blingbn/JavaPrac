import java.util.Arrays;

public class prac2 {

	public static void main(String[] args) {
		
		
		int [] arr = new int [5];
		int tmp = arr.length;
		System.out.println(tmp);
		System.out.println(arr[2]); // 0으로 초기화되어있
		
		
		int [] score = new int [] {10,20,30}; // 배열의 생성과 초기화를 동시에

		int [] num = {1,2,3,4,5}; //배열의 생성과 초기화를 동시에 new int없이 사용
		
		int [] score1 = new int[0];
		//int result = add(new int[]{100, 200, 300, 400});
		
		
		
		//Arrays.toString(배열명); -> 반복문 없이 출력시 배열의 내용 출력시 사
		System.out.println(Arrays.toString(score));
		
		
				
				
		
		
		
	}

}
