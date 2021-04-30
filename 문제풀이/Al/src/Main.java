import java.util.Scanner;

public class Main {
		
	
	public String solution(String str) {
		String answer="";
		String [] s = str.split(" ");
		
//		for(int i = 0; i<s.length; i++) {
//			if(s[0].length()>=s[i].length()) {
//				answer=s[0];
//			}else {
//				answer=s[i];
//			}
//		}
		
		
		
		int max = Integer.MIN_VALUE;//가장작은값으로 초기화 
		
		for(String a : s) {
			System.out.println(a);
			int leng = a.length();
			
			if(leng>max) {
				max = leng;
				answer = a;
			}
			
		}
		
		return answer;

	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
	}

}

