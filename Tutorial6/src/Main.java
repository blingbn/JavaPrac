public class Main{
	

	
	public static void main(String[] args) {
		
		
		
		
	}
}


/*
public class Main{
	
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for(;;) 
		{
			
			System.out.println("출력");
			count++;
			if(count == 10) {
				break;//break가 없을경우 무한루프
			} 
		}
		
		
	}
}


public class Main{
	
	final static int N = 15;
	
	public static void main(String[] args) {
		
		
		// x^2 + y^2 = r^2
		for(int i = -N; i <= N; i++) 
		{
			for(int j = -N; j <= N; j++) 
			{
				if(i * i + j * j <= N * N) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
}


public class Main{
	final static int N = 30;
	public static void main(String[] args) {
		//for문 : 초기화부분, 조건부분, 연산부분
		for(int i = N; i>0;  i--) {
		
			//System.out.println("*" );
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

public class Main{
	
	public static void main(String[] args) {
		
		int i = 1, sum = 0;
		//System.out.println(sum += i++);
		//출력한 후에 1을 더해 주는거기때문에 i = 1부터 시작, 출력된 후엔 2로 변경되므로 sum은 2가 됨.
		while( i <= 1000) {
			sum += i++; //반복문 while은 ()안에 값이 참일경우에 아래가 실행되는것
		}
		System.out.println("1부터 1000까지의 합은 " + sum + "입니다." );
		
	}
}


public class Main {

	public static void main(String[] args) {
		
		String a = "Man";
		int b = 0;
		
		//자바는 String을 비교할 때 equal()을 이용
		//String은 다른자료형과는 다른 문자열 자료형이기 때문
		
		if(a.equals("Man")) {
			System.out.println("남자입니다.");
		}else {
			System.out.println("여자입니다.");
		}
		
		if(b == 3) {
			System.out.println("b는 3입니다.");
		}else {
			System.out.println("b는 3이 아닙니다.");
		}
		
		if(a.equalsIgnoreCase("man") && b == 0){
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다..");
		}
	}

}

public class Main {

	public static void main(String[] args) {
		
		int score = 95;
		
		if(score >= 90){
			System.out.println("A+입니다.");
		}else if(score >= 80){
			System.out.println("B+입니다.");
		}else if(score >= 70){
			System.out.println("C+입니다.");
		}else {
			System.out.println("F입니다.");
		}

	}

}
*/