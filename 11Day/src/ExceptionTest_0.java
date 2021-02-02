
public class ExceptionTest_0 {

	public static void main(String[] args) {
		int value = 0;
		int num = 3 / value; //   3/0 예외발생 아래로 진행 x 
		//예외사항 JDK가 상황에 맞는 EXCEPTION CLASS 콘솔에 찍어줌
		System.out.println("나눗셈연산완료");
		int result = num + 100;
		System.out.println("연산된 값"+result);
		System.out.println("정상종료 ==============");
	}

}
