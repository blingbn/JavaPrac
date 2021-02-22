package prac;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		String mesg = "홍길동, 이순신, 유관순";
		
		StringTokenizer st = new StringTokenizer(mesg,",");
		while(st.hasMoreTokens()) { //true라면~~~~
			String token = st.nextToken();
			int count = st.countTokens();
			System.out.println("뒤에 있는 토큰의 값 : "+token);
			System.out.println("남은 토큰의 수 : "+count);
		}
	}
}
