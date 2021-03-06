import java.util.Date;

public class Sample01_dataType {

	public static void main(String[] args) {
		
		System.out.println("\uD64D"); //문자열 == String
		System.out.println('\uD64D'); //문자 == char
		System.out.println(100); //정수
		System.out.println(3.14); //실수 == 3.14D와 동일
		System.out.println(3.14D); // 실수, D와 동일
		System.out.println(3.14F); //실수, F와 동일
		
		System.out.println(true); // 논리값(true, false)
		System.out.println(false); // 논리값(true, false)
		
		/*
		System.out.println(null); // null값, 가리키지 않는 것 (참조하지 않는것)
		
		--참조형 변수 - 값이 있는 곳에 주소를 가지고 있음
		Date 객체
		
		
		*/
		System.out.println(new Date()); // 날짜  java.util을 import 함(라이브러리 import)
		
		/*오류 1)
		byte testByte = 300; // byte 범위값 초과 -128~ 127
		int testLong = 123L; // int는 정수형 Long타입으로 지정해놓고 int에 담아버림, 타입불일치
		float testFloat = 3.14; // f 누락 , 소수의 기본은 double, 타입불일치
		char testChar = "A"; // 문자는 ' ' 로, 문자열은 " "
		boolean testBoolean = TRUE; // Boolean의 값은 소문자! 
		boolean testBoolean2 = 0; //값은 true or false		
		*/
		/* 수정1)
		int testByte = 300; // byte 범위값 초과 -128~ 127
		long testLong = 123L; // int는 정수형 Long타입으로 지정해놓고 int에 담아버림, 타입불일치
		double testFloat = 3.14; // f 누락 , 소수의 기본은 double, 타입불일치
		String testChar = "A"; // 문자는 ' ' 로, 문자열은 " "
		boolean testBoolean = true; // Boolean의 값은 소문자! 
		boolean testBoolean2 = false; //값은 true or false
		
		수정2)
		byte testByte = 127; // byte 범위값 초과 -128~ 127
		int testLong = 123; // int는 정수형 Long타입으로 지정해놓고 int에 담아버림, 타입불일치
		float testFloat = 3.14f; // f 누락 , 소수의 기본은 double, 타입불일치
		char testChar = 'A'; // 문자는 ' ' 로, 문자열은 " "
		boolean testBoolean = true; // Boolean의 값은 소문자! 
		boolean testBoolean2 = flase; 은 true or false
		*/
		
		
		/* 오류 2)
		boolean testBoolean = true; // Boolean의 값은 소문자! 
		boolean testBoolean = flase;  위의 변수값이랑 같이 때문에 error발생
		 */
		
		int testInt = 123;
		
		testInt = 100;
		testInt = 200;
		testInt = 100 + 200;
		
		System.out.println(testInt); //300이 출력 됨
		
		
		
		
		
		
		
	}
	
}