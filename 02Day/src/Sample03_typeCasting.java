
public class Sample03_typeCasting {

	public static void main(String[] args) {


		
		
		//데이터 타입 변경(자동변경) : 묵시적
		//1. byte - > short -> int -> long - > float -> double 
		byte b = 10;
		short b2 = b;
		int b3 = b2;
		long b4 = b3;
		float b5 = b4;
		double b6 = b5;
		System.out.println(b6);
		
		
		
		
		//2.  char -> int
		char n = 'A';
		int n2 = n + 1;
		System.out.println(n2); // 66출력
		
		char c = (char)n2; //int -> char명시적 형 변환
		System.out.println(c); //대문자 B 출력 (아스키코드)
		
		
		
		//3. int보다 작은 타입의 연산결과는 자동 int로 변환
		short x = 10;
		short x2 = 20;
		int x3 = x + x2; // 자동으로 int 값 변환
		short x4 = (short)(x + x2); // 수정 명시적형변환
		
		
		//4. 문자열과 + 문자열이 아닌 데이터 ->연결된 문자열로 반환
		System.out.println("10"+ 1 + 2 + 3); // 10123 반환
		System.out.println(1 + 2 + 3 + "10"); // 610 반환
		//System.out.println("10"-1); 빼기는 안됨
		
		
		//"10" -> 정수 10변환
		// Javascript -> Number.parseInt("10") ==> 10
		// Java -> Integer.parseInt("10") ==> 10
		String k = "10";
		System.out.println(k+20); // 1020 출력
		
		int k2 = Integer.parseInt(k); // 문자열 "10"을 정수 10으로 변환
		System.out.println(k2+20);
		
		
		
		//===연습
		
		
		String num1 = "10"; //문자열
		String num2 = "20"; //문자열
		
		//int rr1 = num1 + num2;//에러발생
		String rr1 = num1 + num2;
		System.out.println(rr1);
		
		//num1, num2를 덧셈하여 30이 나오도록 출력
		//int rr2 = Integer.parseInt(rr1);
		int intnum1 = Integer.parseInt(num1);
		int intnum2 = Integer.parseInt(num2);
		int rr2 = intnum1 + intnum2;
		int rr3 = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println(rr2);
		System.out.println(rr3);
		
		
		// 10 ==> "10" 정수 10을 문자열 10으로  pdt기본데이터형 -> 문자열 변환
		//Javascript -> toString();
		//Java -> String.valueOf();
		
		
		System.out.println(String.valueOf(10)+10);//1010
		System.out.println(10+""+10); //tip -> 문자열 10으로 바뀌므로 위에 값과 동일 
		
		
		//5. 작은타입과 큰타입이 연산 => 큰타입
		int p = 100;
		double p2 = 3.14;
		double p3 = p + p2;
		
		
		
		
		
	}

}
