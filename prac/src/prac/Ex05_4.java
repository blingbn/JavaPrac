package prac;

public class Ex05_4 {

	public static void main(String[] args) {
		
		int [] num;
		num = new int[] {1,2,3};
		
		for(int x : num) {
			System.out.println("정수 배열 값 : " + x);
		}
		
		String[] name = new String[] {"홍길동", "이순신", "유관순"};
		
		for(String str : name) {
			System.out.println("문자열 배열 값 : " + str);
		}
		
		
		
	}

}
