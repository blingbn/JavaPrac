
public class Ex04_4 {

	public static void main(String[] args) {
		// break문을 제거한 switch문
		
		
		int score = 88;
		
		switch(score / 10) {
			
		case 10 : System.out.println("10이다."); 
		case 9 : System.out.println("9다.");
		case 8 : System.out.println("8이다.");
		case 7 : System.out.println("7이다.");
		case 6 : System.out.println("6이다.");
		default : System.out.println("default이다.");
		}//end swtich
		System.out.println("점수는 " + score);

	}

}
