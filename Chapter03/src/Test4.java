
public class Test4 {

	public static void main(String[] args) {
		// 
		
		
		int a = 11;
		//a 10 ~ 100 사이가 맞는지
		
		//boolean result = 10 < a < 100; // 수학식처럼 사용 불가, 아래처럼 사용해야함.
		boolean result = (a > 10) && (a < 100);
		System.out.println(result);
		
	}

}
