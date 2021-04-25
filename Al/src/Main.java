import java.util.Scanner;

public class Main {
		
	
	public String solution(String str) {
		String answer = "";
		
//		String s [] = str.split(" ");
//
//		int max = Integer.MIN_VALUE;//가장작은값으로 초기화 
//		
//		for(String a : s) {
//			System.out.println(a);
//			int leng = a.length();
//			
//			if(leng>max) {
//				max = leng;
//				answer = a;
//			}
//			
//		}
		
		//subString, indexOf
		
		int max = Integer.MIN_VALUE; 
		int pos ;
		
		while((pos=str.indexOf(' '))!=-1){
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len>max) {
				max = len;
				answer = tmp;
			}
			str= str.substring(pos+1);
		}
		
		if(str.length()>max) answer = str;
		return answer;

	}
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		System.out.println(T.solution(str));
	}

}

