
public class ArrayTest04 {

	public static void main(String[] args) {
		
		//4. 다음배열의 내용을 실행 결과와 같이 출력 되도록 프로그램 작성
		// 출력물 : 100 90 80 70 60 50 40 30 20 10
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		/*
		for(int i=arr.length-1; i>=0; i-- ){
			System.out.print(arr[i]+ " ");
		}
		*/
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[arr.length-1-i]+" ");
		}
	}

}
