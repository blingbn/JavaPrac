import java.util.HashSet;

public class SetTest4 {
	
	
	
	
	public static void main(String[] args) {
		int m = 9;
		System.out.println("변경전 : " + m);
		change(m);
		System.out.println("변경후 : " + m);

		int[] m2 = {9,8,7};
		System.out.println("변경전 : " + m2[0]);
		change2(m2);
		System.out.println("변경후 : " + m2[0]);
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		System.out.println("변경전 : "+ set);
		change3(set); //public static void change3(HashSet<String> set)
		System.out.println("변경후 : "+ set);
		
		
		
	}
	public static void change(int num) {
		num = 10;		
	}
	public static void change2(int[] num) {
		num[0] = 10;		
	}

	public static void change3(HashSet<String> num) {
		num.remove("홍길동");
		
	}

}
