
public class ArrayTest02 {

	public static void main(String[] args) {
		
		//2. 다음 배열의 홀수번째 정수의 합을 구하는 프로그램 작성
		// 출력물 : sum = 300
		
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		
		//1.
		int sum=0;
		
		for(int i=1; i<arr.length;i+=2) {
			sum+=arr[i];
		}System.out.println(sum);
		/*
		for(int i=0; i<arr.length; i++) {
			if(i%2 != 0) {
				sum+=arr[i];
			}
		}System.out.println(sum);
		*/
	
	}

}
