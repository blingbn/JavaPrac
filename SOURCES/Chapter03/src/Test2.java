
public class Test2 {

	public static void main(String[] args) {
		//문자열이 같은지를 비교할 땐 비교연산자 == 를 쓰지 않음.
		
		
		
		String m1 = "Hello";
		String m2 = "Hello";
		System.out.println(m1.equals(m2));
		boolean result = m1 == m2; //사용x 
		//System.out.println(result); // no error 비교 가능하나 사용x 
		
		
		//=====================================================
		
		
		String m3 = new String("Hello");
		result = m1 == m3;
		System.out.println(result); //이 경우 주소를 비교하는거지 내용비교가 아님.
		
		
		System.out.println(m3);
		//대문자 또는 소문자 구분함
		
		//=====================문자열 비교를  하고싶다면
		result = m1.equals(m3);
		
		System.out.println("equals 사용 ======== " + result);
	
	
		//연습========================================================
		
		String s1 = "hello";
		String s2 = "hello";
		String s3 = new String("hello");
		
		
		//비교 + 사용금지!!
		System.out.println("== 사용결과 : " + (m2 == m3)); //m3는 위치를 반환하므로 다름.
		
		//문자열비교는 무조건 equals 기억
		
		System.out.println("equals 사용 결과 : " + s2.equals(s3));
		System.out.println("equals 사용 결과 : " + s1.equals(s2));
		System.out.println("equals 사용 결과 : " + s1.equals(s3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
