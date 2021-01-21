import java.util.Scanner;
public class ScannerTest3 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 이름 입력하세요. ");
		String str1 = scan.next();
		System.out.println("두번째 이름 입력하세요. ");
		String str2 = scan.next();
		
		//첫번째이름과 두번째이름을 입력, 두이름을 비교 동일여부 확인
		
		String result = str1.equals(str2)? "이름이 동일합니다." : "이름이 동일하지 않습니다.";
		System.out.println(result);
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
