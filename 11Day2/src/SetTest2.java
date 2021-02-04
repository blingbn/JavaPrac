import java.util.HashSet;
import java.util.Iterator;

public class SetTest2 {

	public static void main(String[] args) {
		
		
		
		HashSet<String> set = new HashSet<>();
		
		
		set.add("1");
		set.add("1");
		set.add("1");// 중복불가
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
		set.add("6");
		//set.add("10")
		
		
		//1. toString()
		System.out.println("=====set.toString =====" + set);
	
		//2. foreach
		for(String x : set) {
			System.out.print(x+" ");
		}
		
		//3. 일관된 방법인 Iterator 이용
		Iterator<String>ite = set.iterator();
		while(ite.hasNext()) {
			String m = ite.next();
			System.out.println(">>"+m);
		}
		System.out.println();
		
		Iterator<String> it2 = set.iterator();
		while (it2.hasNext()) {
			String string = (String) it2.next();
			System.out.print(string);
		}
		System.out.println();
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			String string = (String) i.next();
			System.out.print(string);
		}
	}

}
