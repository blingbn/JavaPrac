
public class Ex05_8 {

	public static void main(String[] args) {
		// 파라미터
		
		
		int[] num = {1,2,3,4};
		System.out.println("원래 배열");
		for(int i : num) {
			System.out.println(i);
		}
		change(num);
		System.out.println("수정된 배열");
		for(int i : num) {
			System.out.println(i);
		}

	}//end main
	public static void change(int[] num) {//함수(메소드) 리턴타입 (처리후 반환값의 타입 void : 반환값 없음) 함수명(매개변수 명)
		num[0] = 100;
	}

}
