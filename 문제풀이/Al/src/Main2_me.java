import java.util.Scanner;

public class Main2_me {
		
	
	public String solution(String str) {
		String answer="";
		
		char s [] = str.toCharArray();
		
//		for(int i = 0; i<s.length; i++ ) {
//			if(Character.isLowerCase(s[i])) {
//				answer+=Character.toUpperCase(s[i]);
//			}else {
//				answer+=Character.toLowerCase(s[i]);
//			}
//		}
		for(char c : s) {
			
//			if(c>=65&&c<=90) {
//				answer+=Character.toLowerCase(c);
//			}else {
//				answer+=Character.toUpperCase(c);
//			}
			
			if(c>=97&&c<=122) {
				answer+=(char)(c-32);
			}else {
				answer+=(char)(c+32);
			}
			
		}
//			if(x>=97&&x<=122) {
//				answer+=(char)(x-32);
//			}else {
//				answer+=(char)(x+32);
//			}
		return answer;

	}
	public static void main(String[] args) {
		Main2_me T = new Main2_me();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		System.out.println(T.solution(str));
	}

}

