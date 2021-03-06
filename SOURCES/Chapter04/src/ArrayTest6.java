import java.util.Arrays;


public class ArrayTest6 {

	public static void main(String[] args) {
		//
		
		
		
		
		
		int [] num2 = {10,20,30,40,50};
		
		
		
		//정렬
		int [] xyz = {9,4,3,12,55,63,2,3,190};
		Arrays.sort(xyz);
		for(int i :xyz) {
			System.out.println("***"+i);
		}
		
		
		/*
		//3. 값 비교

		int[]a= {10,20};
		int[]b= {10,20};
		
		System.out.println( a == b); //주소비교이므로 false
		System.out.println(Arrays.equals(a, b)); // 주소가 아닌 배열내용비교로 true
		
		
		*/
		/*
		//2. 채워넣기
		
		Arrays.fill(num2, 100);
		for(int i : num2) {
			System.out.println("###" + i);
		}
		Arrays.fill(num2, 0, 3, 200);
		for(int i : num2) {
			System.out.println("!!!" + i);
		}
		
		
		
		
		
		
		
		
		
		//1. 배열복사
		int[] xxx = Arrays.copyOf(num2,  num2.length);
		for(int i : xxx) {
			System.out.println(i);
		}
		int [] xxx2 = Arrays.copyOf(num2, 5);
		for(int i : xxx2) {
			System.out.println(">>>" + i);
		}
		
		
		*/
		
	}

}
