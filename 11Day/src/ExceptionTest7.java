

public class ExceptionTest7 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			//작업 1
			int num = 10;
			int result=10/0;
		}finally {
			System.out.println("반드시수행되는문장");
		}System.out.println("프로그램종료");
	}

}
