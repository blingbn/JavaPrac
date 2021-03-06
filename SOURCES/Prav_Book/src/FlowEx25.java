import java.util.Scanner;

public class FlowEx25 {

	public static void main(String[] args) {
		
		
		
		int num = 0;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		num = scan.nextInt();
		
		//num을 10으로 나눈 나머지를 sum에 더함
		while(num!=0) {
			sum+=num%10; // sum = sum+num%10
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num/=10;//num = num/10; num을 10으로 나눈 값을 다시 num에 저장
		}
		System.out.println("각 자리수의 합" + sum);
		

	}

}
