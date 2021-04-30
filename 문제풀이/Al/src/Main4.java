import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
		
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
//		for(String x : str) {
//			String tmp = new StringBuilder(x).reverse().toString();
//			answer.add(tmp);
//			
//		}
		
		//특정조건만 
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length();
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); //String화 시켜줌 Static 클래스 메소드 
			answer.add(tmp);
		}
		
		return answer;

	}
	public static void main(String[] args) {
		Main4 T = new Main4();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String [] str = new String[n];
		
		for(int i = 0; i<n; i++) {
			str[i] = in.next();
		}
		for(String x : T.solution(n, str)) {			
			System.out.println(x);
		}
	}

}

