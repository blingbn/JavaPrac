import java.util.Scanner;

public class FlowEx7 {

	public static void main(String[] args) {
	
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(1), 바위(2),보(3) 중 하나를 입력하세요.");
		int user = scan.nextInt();
		int com = (int)(Math.random()*3)+1;// Math.random은 0~1미만을 출력하기에 +1해줘야함.
		
		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴퓨터는" + com + "입니다.");	
		
		switch(user-com){
			case  2 : case -1: //user가 2이고 com.Mathrandom시 값이 -1인경우
				System.out.println("당신이 졌습니다.");
				break;
			case 1: case -2://user가 1이고 com.Mathrandom시 값이 -2인경우
				System.out.println("당신이 이겼습니다.");
			case 0:
				System.out.println("비겼습니다.");
		}
		
		

	}

}
