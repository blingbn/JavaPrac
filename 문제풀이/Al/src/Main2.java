import java.util.Scanner;

public class Main2 {
		
	
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			
//			if(x>=65&&x<=90) {
//				answer+=Character.toLowerCase(x);
//			}else if(x>=97&&x<=122) {
//				answer+=Character.toUpperCase(x);
//			}
//			
			
			if(x>=97&&x<=122) {
				answer+=(char)(x-32);
			}else {
				answer+=(char)(x+32);
			}
			
			
			
//			if(Character.isLowerCase(x)) {
//				answer+=Character.toUpperCase(x);
//			}else {
//				answer+=Character.toLowerCase(x);
//			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Main2 T = new Main2();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));
	}

}

