
public class Ex02_1 {

	public static void main(String[] args) {
		
		System.out.println(1234);
		System.out.println(3.14F);
		System.out.println(3.14);
		
		
	    StringBuffer s = new StringBuffer("Hello");
	    System.out.println(s);
	    s.insert(5, "!!!");
	    s.delete(0, 5);
	    System.out.println(s);
	}

}
