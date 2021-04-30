import java.util.Scanner;

public class Main1_me {
		
	
	public int solution(String str, char c ) {
		int answer=0;
		
		String s = str.toLowerCase();
		char s2= Character.toLowerCase(c);
		
//		for(int i = 0; i<s.length(); i++) {
//			if(s.charAt(i)==s2) {
//				answer++;
//			}
//		}
		
		for(char x : s.toCharArray()) {
			System.out.print(x);
			System.out.println();
			if(x==s2) {
				answer++;
			}
		}
		
		return answer;

	}
	public static void main(String[] args) {
		Main1_me T = new Main1_me();
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char c = str.charAt(0);
		System.out.println(T.solution(str, c));
	}

}

