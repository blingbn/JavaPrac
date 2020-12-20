
public class Main {
	
	
	public static void main(String[] args) {
		double b = 0.5 ;
		int a = (int) (b + 0.5);
		//(int)를 하면 정수형을 실수형으로 변환할 수 있음.
		//반올림한 값 = (int) (실수 + 0.5) ;
		System.out.println(a);
		
	}

}

/*
public class Main {
	
	
	public static void main(String[] args) {
	
		int a = 1;
		int b = 2;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		
		
		// a + b는 왜 12가 되고 (a + b)는 3이 나오지 ?
	}

}


public class Main {
	
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
	
		int a = INT_MAX ;
		System.out.println(a + 1);
		
		// int 형의 경우 -2147483647 ~ 2147483647의 값을 가짐
		//이 값을 벗어날 경우 가장 작은 값 또는 가장 큰값으로 돌아감. 순환형이 됨
		//이걸 overflow라고 함.
	}

}


public class Main {
	
	final static double PI = 3.141592;
		
	//final은 한번 선언이 되면 절대 바뀔수 없다 = 상수
	//static 하나의 클래스에서 공유하는 클래스
	//double은 실수를 나타내는 자료형
	public static void main(String[] args) {
	
		int r = 30;
		System.out.println(r * r * PI);
		
		
	}

}

public class Main {

	public static void main(String[] args) {
		
		int intType = 100;
		// 정수형을 나타내는 자료형 int
		double doubleType = 150.5;
		//실수형을 나타내는 자료형 double
		String stringType = "이빛나";
		//문자열을 나타내는 자료형 String
		//String, Array의 경우 비원시적형이기때문에 대문자로 시작함
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
	}

}
*/