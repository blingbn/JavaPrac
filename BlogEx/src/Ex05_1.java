
public class Ex05_1 {

	public static void main(String[] args) {
		
		int[] num; //배열의 선언
		num = new int [4]; // 배열 생성
		num[0] = 1; // 배열의 초기화
		num[1] = 2; // 배열의 초기화
		num[2] = 3; // 배열의 초기화
		
		for(int i=0; i<num.length; i++) { //length를 이용한 num 배열의 값 구하기
			System.out.print(num[i]+" ");
		}
		
	}

}
