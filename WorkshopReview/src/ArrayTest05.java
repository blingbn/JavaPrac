import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		//1. 다음 배열의 내용을 실행 결과와 같이 출력 되도록 프로그램을 작성하시오.
		//90 80 80 60 40 50 10 30 20
		int[][] arr2 = {
				{20,30,10},
				{50,40,60},
				{80,80,90}
		};
		
		for(int i=arr2.length-1; i>=0; i--) {
			for(int j=arr2[i].length-1; j>=0; j--) {
				System.out.print(arr2[i][j]+ " ");
			}
		}
		
		
		
		
	}

}
