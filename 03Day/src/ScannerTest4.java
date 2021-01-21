import java.util.Scanner;
public class ScannerTest4 {

	public static void main(String[] args) {
		
		
		//콘솔에서 숫자를 입력하세요. -> 숫자입력받고 
		//짝수인지 홀수인지 판단 후 선택 출력 
		
		
		/*
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		//String result = (num%2 == 1)? "홀수입니다." : "짝수입니다.";
		String result = (num%2 != 0)? "홀수입니다." : "짝수입니다.";
		System.out.println("입력하신 숫자는 " + result);
		
		scan.close();
		*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		String str = scan.next();
		int num = Integer.parseInt(str);

		String result = (num%2 != 0)? "홀수입니다." : "짝수입니다.";
		System.out.println("입력하신 숫자는 " + result);
		
		scan.close();
		
		
		
		

	}

}
