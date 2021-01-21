import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		
		System.out.println("이름을 입력하세요");
		Scanner scan = new Scanner(System.in);//콘솔입력사용 객체 생성
		String name = scan.next(); //콘솔의 입력내용을 문자열로 가져옴
		System.out.println("입력하신 이름은 : "+name);
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		System.out.println(age);
		
		scan.close();
		
	}

}
