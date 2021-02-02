

public class ExceptionTest6 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			//작업 1
			int num = 10;
			int result = num / 2;
			System.out.println(result);
		
			//작업2
			String name= "aa";
			System.out.println(name.length());
			
			//작업3==> 우리가 알고있는 예외가 아니다.
			int[] num2 = {10,20};
			System.out.println(num2[1]);	
		}
		catch(NullPointerException e) { 
			System.out.println("예외발생 1 " + e.getMessage());
		}catch(ArithmeticException e) { // 딱 맞는 타입의 exception캐치문을 잡아야함.
			System.out.println("예외발생 2 " +e.getMessage());
		}catch(Exception e) { // e3.get
			System.out.println("예외발생 3 " +e.getMessage());
		}finally {
			System.out.println("반드시 수행되는 문장");
		}
	}

}
