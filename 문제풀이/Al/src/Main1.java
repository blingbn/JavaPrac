import java.util.Scanner;

public class Main1 {
	public int solution(String str, char t) {
		
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
//		for(int i = 0; i<str.length();i++) {
//			if(str.charAt(i)==t) {
//				answer++;
//			}
//		}
		
		//for-each
		//toCharArray ==>문자열을 문자객체로 
		for(char x : str.toCharArray()) {
			if(x==t) answer++; 
		}
		return answer;
	}
	public static void main(String[] args) {
		Main1 T = new Main1();
		    Scanner in=new Scanner(System.in);
		    String str = in.next();
		    char c = in.next().charAt(0);
		    System.out.println(T.solution(str, c));
	}

}

