import java.util.Random;
public class RandomTest {

	public static void main(String[] args) {
		
		
		
		//랜덤값 얻기
		Random r = new Random();
		int n = r.nextInt(5)+1; //1~5까지
		System.out.println(n);
		
		
		boolean n2 = r.nextBoolean();
		System.out.println(n2);
		
		double n3 = r.nextDouble();
		float n4 = r.nextFloat();
		System.out.println(n3);
		System.out.println(n4);
		

	}

}
