import java.util.Scanner;
public class ScannerTest2 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String str = scan.next();
		String name = "이빛나";
		String result = str.equals(name)? "이름이 맞습니다" : "이름이 다릅니다";
		System.out.println(result);
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
