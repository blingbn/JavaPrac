import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		//scanner클래스를 사용하여 키보드 정수값을 입력받아서 1부터 입력받은 정수값까지의 총합을 구해라, 0을 입력하는 경우 다시 입력받는다.
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		
		int sum = 0;

		if(num!=0) {
			
			for(int i =1; i <=num; i++) {
				
				sum += i;
				System.out.println("n값 :" + i);
			}
		}System.out.printf("%d부터 %d까지의 총합 : %d",1,num,sum);
		
		*/
		
		/*선생님 답
		int n = 0;
		int sum=0;
		
		do{
			System.out.print("n값");
			n = scan.nextInt();
		}while(n<=0); {
			for(int i = 1; i<=n; i++) {
				sum+=i;
			}
		}System.out.printf("1부터 %d까지의 총합 : %d", n, sum);
		 */
	
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a = scan.nextInt();
		
		int b = 0;
		while(true) {
			System.out.println("b의값 : ");
			b = scan.nextInt();
			if(b>a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		System.out.println("b-a는 "+(b-a)+ "입니다.");
		*/
		
		
		
	
		// 14번
		System.out.println("-----곱셈표-----");
		for(int i = 1; i<=9; i++) {
			for(int j =1; j<=9; j++)
				System.out.printf("%3d",j*i);
				System.out.println();
		}
		
		
		//20.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
