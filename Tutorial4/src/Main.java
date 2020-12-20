
public class Main {
	
	
	public static void main(String[] args) {
		
		
		int i = 20;
		//i++;
		//i = i + 1;
		i += 2;
		System.out.println(i);
		//System.out.println((100 < i) && (i < 200));
		
	}
	

}
/*
public class Main {
	
	
	public static void main(String[] args) {
		
		//pow는 거듭제곱
		
		double a = Math.pow(3.0, 20.0);
		
		System.out.println("3의 20제곱은 " + (int) a + "입니다.");
		
	}
	

}





public class Main {
	
	
	public static void main(String[] args) {
		
		int x = 50;
		int y = 60;
		
		System.out.println("최댓값은 " + max(x,y) + "입니다.");
		
	}
	//반환형(int), 함수이름(max), 매개변수(int a, int b)
		static int max(int a, int b) {
			int result = (a > b) ? a: b;
			//true 일 경우 a, false일경우 b를 반환
			return result;
			
			
		}

	

}

public class Main {
	
	
	public static void main(String[] args) {
		
		
		int a = 50;
		int b = 50;
		System.out.println("a와 b가 같은가요? " + (a == b));
		System.out.println("a가 b보다 큰가요? " + (a > b));
		System.out.println("a가 b보다 작은가요? " + (a < b));
		System.out.println("a가 b와 같으면서 a가 30보다 큰가요? " + ((a == b) && (a > b)));
		System.out.println("a가 50이 아닌가요? " + !(a == 50));

	}

}




public class Main {
	

	public static void main(String[] args) {
		
		System.out.println(1 % 3 );
		System.out.println(2 % 3 );
		System.out.println(3 % 3 );
		System.out.println(4 % 3 );
		System.out.println(5 % 3 );
		System.out.println(6 % 3 );

	}

}

public class Main {
	

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("현재의 a는" + a + "입니다.");
		a++;
		System.out.println("현재의 a는" + a + "입니다.");
		System.out.println("현재의 a는" + ++a + "입니다.");
		System.out.println("현재의 a는" + a++ + "입니다.");
		System.out.println("현재의 a는" + a + "입니다.");
		
		//++가 뒤에 오는 경우 출력이 된 이후에 1이 더해짐.
		//앞에 ++가 오는경우 출력될 때 1이 더해짐.
		

	}

}

public class Main {
	
	final static int SECOND = 1000;
	public static void main(String[] args) {
		
		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute);
		System.out.println(second);

	}

}
*/