import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		
		
		String str = "4,2,3,6,7";
		
		/*
		StringTokenizer st = new StringTokenizer(str,",");
		int sum = 0;
		while(st.hasMoreElements()) {
			sum += Integer.parseInt(st.nextToken());
		}
		System.out.println(sum);
		System.out.println("===============");
		*/
		
		String[] sp = str.split(",");
		for(String s : sp) {
			System.out.print(s+" ");
		}
		
	}

}