
public class ExceptionTest_1 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
	try {
		int num = 10;
		int result = num/0;
		System.out.println("나눗셈완료===============");
		System.out.println(result);
	}catch(ArithmeticException e) { // 딱 맞는 타입의 exception캐치문을 잡아야함.
		System.out.println("catch진입" + e);
	}	
	System.out.println("프로그램 종료");	
	}
}
