
public class StringBuiderTest {

	public static void main(String[] args) {
		
		// *문자열 생성 방법
		// 1. String 클래스 ( 철사 )
		//: 한번 생성된 문장열은 변경 안됨.가공하면 매번 새로운 문자열생성
		// 가) new String("hello"),    "hello"
		// 2. StringBuffer 또는 StringBuilder 클래스 (고무줄)
		//: 한번 생성된 문장열이 변경됨. 동기화
		// 문자열을 가공이 자주 발생되는 경우
		//:  new 이용
		
		StringBuilder builder = new StringBuilder("Hello");
		char x = builder.charAt(0);
		System.out.println(x);
		System.out.println(builder.indexOf("o"));
		System.out.println(builder.length());
		System.out.println(builder.replace(0, 3, "x"));
		System.out.println(builder.substring(1));
		System.out.println(builder.substring(0,3));
		
		String xxx = builder.toString();
		
		builder.append(" AAAA");
		builder.append(" BBBB");
		System.out.println(builder.toString()); //원본이 변경됨.
		
		builder.insert(0, "KKKKK ");
		System.out.println(builder.toString()); //원본이 변경됨.
		
		builder.delete(0, 5);
		System.out.println(builder.toString()); //원본이 변경됨.
		
		builder.reverse();
		System.out.println(builder.toString()); //원본이 변경됨.
		
		//메서드 체인
		builder.append(" !!!").insert(0, "xxx").delete(0, 4);
		System.out.println(builder.toString()); //원본이 변경됨.
		
		builder.append(" !!!").append(" !!!").append(" !!!");
		
	}

}
