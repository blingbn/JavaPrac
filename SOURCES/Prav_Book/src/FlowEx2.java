import java.util.Scanner;

public class FlowEx2 {

	public static void main(String[] args) {
		//Scanner이용, 0이면 입력하신숫자는 0 아니면 입력하신숫자는 0이 아니고 n입니다. 출력

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = scan.nextInt();
		
		if(n==0) {
			System.out.println("입력하신 숫자는"+n+"입니다.");
		}else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 "+n+" 입니다.");
		}
		
		
		
		
	}

}
