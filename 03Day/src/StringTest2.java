
public class StringTest2 {

	public static void main(String[] args) {

		/*
		 * String z = String.valueOf(true); // "true" String z2 = String.valueOf(10);
		 * //"10" String z3 = String.valueOf(3.24F); String z4 = String.valueOf(new
		 * char[] {'A','B'}); String z5 = String.valueOf(4.5D); String z6 =
		 * String.valueOf(125L); System.out.println(z); System.out.println(z2);
		 * System.out.println(z3); System.out.println(z4); System.out.println(z5);
		 * System.out.println(z6);
		 * 
		 * 
		 * 
		 */

		String str3 = "Hello world";
		System.out.println(str3.toCharArray());

		/*
		 * //trim, length 사용 String t = "  hEllo   "; System.out.println(t.length());
		 * System.out.println(t.trim().length()); // 공백제거후
		 */
		/*
		 * //String의 메소드 사용법 String xyz = "helloworld"; char[]xyz2 = xyz.toCharArray();
		 * for(int i = 0; i < xyz2.length; i++) { System.out.println(xyz2[i]); }
		 */

		/*
		 * //substring 함수 String xyz = "helloworld"; String q = xyz.substring(3);//3부터
		 * 끝까지 String q2 = xyz.substring(3,7); // 3부터 7까지 System.out.println(q);
		 * System.out.println(q2);
		 */

		/*
		 * // split함수 : 문자열에서 특정문자를 기준으로 나누는 작업 String mesg="홍길동/이순신/유관순"; String [] n =
		 * mesg.split("/"); System.out.println(n[0]); System.out.println(n[1]);
		 * System.out.println(n[2]);
		 * 
		 * 
		 * System.out.println(n.length); for(int x = 0; x<n.length; x++) {
		 * System.out.println(n[x]); }
		 */

		/*
		 * //charAt(자리수) : 자리수에 해당 문자를 가져옴
		 * 
		 * String s = "hello"; char x = s.charAt(0); 
		 * System.out.println(x);
		 * System.out.println(s.charAt(1));
		 

		 * //concat("문자열") : 문자열을 이어붙여서 새로운 문자열 만듬
		 * 
		 * String x2 = s.concat("world"); System.out.println(x2); System.out.println(s);
		 */

		/*
		 * //length() : 문자열길이
		 * 
		 * String s= "hello"; 
		 * int x3=s.length(); 
		 * System.out.println(x3); 
		 * String aaa ="Hello"; 
		 * String aaa2 = "Hello"; 
		 * boolean result = aaa.equals(aaa2);
		 * System.out.println(result); 
		 * boolean result2 = aaa.equalsIgnoreCase(aaa2); //
		 * 대소문자 상관없이 비교 true System.out.println(result2);
		 * 
		 * 
		 * System.out.println("".length()); // 없을경우 0
		 */
		String s = "hello";

		boolean m = s.equals("hello");
		System.out.println(m);
		
		
		
		/*
		 * //contains("문자열") : 지정한 문자열이 포함되어 있는지 boolean 리턴
		 * 
		 * String s = "hello"; 
		 * boolean kkk = s.contains("h"); 
		 * System.out.println(kkk);
		 * boolean kkk2 = s.contains("hx"); 
		 * System.out.println(kkk2);
		 */

		/*
		 * //endsWith("문자열") : 끝이 지정한 문자로 끝나는지 boolean 리턴 
		 * String s = "hello"; boolean
		 * kkk3 = s.endsWith("o"); 
		 * System.out.println(kkk3);
		 * 
		 * boolean kkk4 = "world".endsWith("o"); 
		 * System.out.println(kkk4);
		 * 
		 */

		/*
		 * //startsWith("문자열") : 지정문자열로 시작하는지 여부 boolean boolean kkk5 =
		 * "world".startsWith("w"); System.out.println(kkk5);
		*/
		  //문자열만들기
		 //String ppp = String.format("%s %d", "홍길동" ,20);
		 //System.out.println(ppp);
	

		/*
		 * //indexOf("문자열") : 지정문자열 위치 
		 * int index = "hello".indexOf("a");
		 * System.out.println(index); // 안들어있을경우 -1
		 * 
		 */

		/*
		 * // boolean타입 문자열이 비어있는지 여부 System.out.println("".isEmpty());
		 */

		/*
		 * //replace("A","B") : A - > B로
		 */

		System.out.println("abc".replace('a', 'A'));
		System.out.println("abc".replace("ab", "xxx"));

		System.out.println("abc".toUpperCase()); // 대문자
		System.out.println("aBdC".toLowerCase()); // 소문자

	}

}
