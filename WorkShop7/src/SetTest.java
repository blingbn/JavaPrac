import java.util.HashSet;
import java.util.Set;

public class SetTest {
//문제 1.
	public static void main(String[] args) {

		String data =args[0];
		char[] a = data.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<a.length; i++) {
			set.add(a[i]); 
		} 
		System.out.print(set);
		
		
		
		
		

	}

}
