

public class ExceptionTest5 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			//작업 1
			int num = 10;
			int result = num / 0 ;
			System.out.println(result);
		}catch(ArithmeticException e) { // 딱 맞는 타입의 exception캐치문을 잡아야함.
			System.out.println("예외발생 2 " +e.getMessage());
		}
		
		try {
			//작업 2
			String name= null;
			System.out.println(name.length());
		}catch(NullPointerException e) { 
			System.out.println("예외발생 1 " + e.getMessage());
		}
	}

}
