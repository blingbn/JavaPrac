
public class Ex02_4 {

	public static void main(String[] args) {
		
		
		
		short s = 12;
		int n = s; // short -> int 로 묵시적 자동 형 변환
		
		char c = 'A';
		int n2 = c + 1; // char -> int로 자동 형변환
		System.out.println(n2);
		
		int x = 123;
		float y = x + 12.3F; // 연산으로 123 + 12.3f float에 형변환
		System.out.println(y);
		
		
		
		//=================================
		
		int c1 = 123;
		//short d = c1; //큰 int타입을 short 타입에 넣을 수 없지만 강제로 가능!
		short d = (short)c1; // 강제형변환 == 명시적 형 변환(Type Casting)
		
		
		
		//================================= 묵시적 형 변환으로 인한 산술 연산시 주의점
		short s1 = 10;
		short s2 = 20;
		//short s3 = s1 + s2; // s1 + s2  연산은 자동으로 int형이 되기 때문에 강제로 short타입으로 변환하거나 타입을 int로 변경
		//int s3 = s1 + s2; // 또는 아래
		short s3 = (short)(s1 + s2);// 명시적형변환
		System.out.println(s3);
		
		
		
		//================================== String
		String str = "hello" + 1 + 2 + 3; //hello 123 출력
		System.out.println(str);
		
		
		String str1 = 1 + 2 + 3 + "hello"; //6hello 출력
		System.out.println(str1); //왼쪽부터 실행이 되기때문에 연산을 먼저한 후 문자열과 연결
	
		String str2 = "hello" + 1 + 2 + 3 + "world"; // hello123world가 출력 됨
		System.out.println(str2);
		
		
		
		//================================== 형변환
		
		//int result1 = 10+3.14; // -> 실수타입이 되므로 정수타입에 넣을 수 없음. 현재 double타입
		//float result3 = 10+3.14; // double타입(기본형)의 실수를 float에 넣을 수 없음.
		
		double result2 = 10+3.14;
		
		float result4 = 10+3.14f; // float타입에 맞게끔 연산이 됨
		
		float result5 = (float)(10 + 3.14); //float로 강제변환 시켰으므로 출력 가능
		
		double result6 = 10; //실수형으로 자동형변환 10.0으로 출력
		System.out.println(result6);
		
		
	}

}
