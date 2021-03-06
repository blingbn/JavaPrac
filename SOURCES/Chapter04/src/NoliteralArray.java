
public class NoliteralArray {

	public static void main(String[] args) {
		// 리터럴을 이용한 배열 생성 (new없음)
		
		
		
		//데이터형 []배열명 = {값1,값2,값3};
		int [] num = {1,2,3,4}; //선언과 생성을 동시에 해야함.
			
		
		for(int x : num) {
			System.out.println("정수 배열값 : " + x);
		}
		
		String [] name = {"홍길동", "이순신", "유관순"};
		for(String s : name) {
			System.out.println("문자열 배열 값 :" + s);
		}
		
		
		
		
		
		
		

	}

}
