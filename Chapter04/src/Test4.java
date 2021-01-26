import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		/*
		for(int i=1; i<=100; i++) {
			if(i<10) System.out.print(" ");
			System.out.print(i + " ");
			if(i%10 == 0) {
				System.out.println();
			}
			
		}
		*/
		/*
		char a = 'A';
		for(int i=1; i<=6; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(a);
				a = (char)(a+1);
			}System.out.println();
			a = 'A';
		}
		*/
		
		/*
		for( char i ='A'; i <= 'E'; i++) {
			for(char j = 'A'; j<=i; j++) {
				System.out.print((char)j);
			}System.out.println();
		}
		*/
		
		//while문 사용 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scan.nextInt();
		int sum = 0;
		int i = num;
		while(1<=i) {
			sum += i;
			i++;
		}
		System.out.println("입력하신 숫자의 총합" + sum);
		
		
	}

}
