import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		/*
		//Arrays.toString(배열이름) -> 배열을 출력하기 위함 
		
		int [] iArr = {100,95,80,70,60};
		
		System.out.println(Arrays.toString(iArr));
		*/
		
		
		
		int [] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
			System.out.println("변경전");

			System.out.println("arr.length : "+ arr.length);
		
		

	}

}
