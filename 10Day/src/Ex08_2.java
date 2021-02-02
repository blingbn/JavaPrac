
public class Ex08_2 {

	public static void main(String[] args) {
		String s = "abcde";
		String s3 = "홍길동 / 이순신 / 유관순";
		System.out.println("시작하는 문자열 비교" + s.startsWith("abc"));
		System.out.println("끝나는 문자열 비교" + s.endsWith("abc"));
		String[] names = s3.split("/");
		for(int x = 0; x<names.length; x++) {
			System.out.println(names[x]);
		}
		System.out.println("123문자열로 반환 : " + String.valueOf(123)); // int 123 -> String 123으로 변경
		System.out.println("123문자열로 반환 : " + 123+""); // int 123 -> String 123으로 변경

	}

}
