package enumtest;

public class EnumTest1 {
	public static void check(int num) {
		//byte, short, int, char, String, enum
		switch(num) {
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3"); break;
		default: System.out.println("default"); break;
		}//ends switch
	}//end check
	
	
	
	public static void main(String[] args) {
		//enum은 상수 대체 가능
		check(1); //1. SELECT 2.INSERT 3. DELETE
		check(2);
		check(3);
	} //ends main
}//end class
