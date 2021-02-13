
final class A{}

//class B extends A{}
class B{}
class C extends B{
	static final int NUM=100;
	
}


public class ImportTest {
	public static void main(String[] args) {
		
		System.out.println(C.NUM);
	}

}
