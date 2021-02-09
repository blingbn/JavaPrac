import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
		
		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz";
		
		StringTokenizer tokens = new StringTokenizer(data, "/ ,");
		while(tokens.hasMoreTokens()) {
			System.out.print(tokens.nextToken()+ " ");
		}	

	}

}
