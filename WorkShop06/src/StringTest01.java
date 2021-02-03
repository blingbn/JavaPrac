import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		String str = "I am second to none";
		StringTokenizer st = new StringTokenizer(str,",");
		int wordCount = 0;
		
		while(st.hasMoreElements()) {
			wordCount++;
			System.out.println(st.nextToken()+ " ");
		}
		System.out.println("단어개수 : " + wordCount);
		System.out.println("======================");
		String strarr[] = str.split(" ");
		for(String s : strarr) {
			System.out.print(s + " ");
		}
		System.out.println("단어갯수 : " + strarr.length);
		
		
		char chararr[] = str.toCharArray();
		StringTokenizer sts = new StringTokenizer(str," ");
		int charCount = 0;
		
		for(int i=0; i<chararr.length;i++) {
			if(chararr[i] == ' ') {
				continue;
			}System.out.print(chararr[i] + " ");
			charCount ++;
		}System.out.println("문자개수 : " + charCount);
		
		
		StringTokenizer tk = new StringTokenizer(str," ");
		String result= "";
		
		while(tk.hasMoreElements()) {
			result+= tk.nextToken();
		}System.out.println(result+"문자의개수 : "+result.length());
		
		
		/*
		
		StringTokenizer tokens = new StringTokenizer(str, " ");
		System.out.println("단어개수 : " + tokens.countTokens());
		
		int tokenNum = tokens.countTokens();
		for(int i = 0; i < tokenNum; i++) {
			String token = tokens.nextToken();
			System.out.print(token+ " ");
		}
		*/
	}

}
