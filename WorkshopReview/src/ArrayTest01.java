
public class ArrayTest01 {

	public static void main(String[] args) {
		
		
		//1. 다음 배열의 합과 평균을 구하는 프로그램 작성
		  //int[] arr = {10,20,30,40,50};
		  // 출력물 :  sum = 150, avg=30.0
		
		
		 int[] arr = {10,20,30,40,50};
		
		 int sum = 0;
		 double avg = 0;
		 for(int i=0; i<arr.length; i++) {
			 sum+=arr[i];
		 }
		 System.out.println("sum = " + sum);
		 System.out.println("avg = " + sum/arr.length);
		 
		
	
	}

}
