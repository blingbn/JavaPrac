import java.util.Scanner;
public class Workshop4 {

	public static void main(String[] args) {
		
		/*
		// Math.random() 
		
		
		//5.
		//Math.random() 0.0~ 1.0보다 작은 숫자 임의로 돌려가면서 계산
		//(Math.random()*6) +1 >공식처럼 외울것 0.1~5.0까지 구하고 +1 해야 6이됨
		
		int value = (int)(Math.random()*6)+1;
		System.out.println(value);
		
		*/
		/*
		
		//6. 세개의 주사위를 던졌을 때, 눈의 곱이 3의 배수인 값
		
		

		for(int i=1; i<=6; i++) {
			for(int j = 1; j<=6; j++) {
				for(int k=1; k<=6; k++)
					if(i*j*k % 3 == 0)
					System.out.println(i+"*"+j+"*"+k+"="+(i*j*k));
					
			}
		}
		*/
		
		/*
		//7. 1부터 100까지 더하는 프로그램 작성 scanner로 1자리 정수형 데이터를 입력받아 입력받은 수의 배수만 더한다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("한자리 정수 값을 입력하세요.");
		int n = scan.nextInt();
		int result = 0;
		for(int i = 1; i <=100; i++) {
			if((i%n) == 0)
			result += i;
				if(i!=n) {
					System.out.print("+");
					System.out.print(i);
				}
		}System.out.print("="+ result);
		*/
		
		
		/*
		//8. 1부터 100까지 반복하면서 3의 배수는 foo, 5의 배수는 bar, 7의배수는 baz값을 출력하는 프로그램
		
		for(int i = 1; i <= 100; i++) {
			System.out.print(i);
			if(i%3 == 0)System.out.print("foo");
			if(i%5 == 0)System.out.print("bar");
			if(i%7 == 0)System.out.print("baz");
			System.out.println("");
		}
			*/
		
		
		//9.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 값을 입력하세요.");
		int a = scan.nextInt();
		System.out.println("정수 값을 입력하세요.");
		int b = scan.nextInt();
		System.out.println("정수 값을 입력하세요.");
		int c = scan.nextInt();
		
		int max = a;
		if(max<b)max=b;
		if(max<c)max=c;
		System.out.println("최대값:" + max );
		
		int min = a;
		if(min>b)min=b;
		if(min>c)min=c;
		System.out.println("최소값:" + min );
		
		
		
	}

}
