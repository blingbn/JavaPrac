
public class TestMain {

	public static void main(String[] args) {
		
		//A a = new A();
		System.out.println(A.NUM);
		//A.NUM =10;
		ConcreteClass c = new ConcreteClass();
		//System.out.println(c.NUM);
		c.a();
		c.b();
		c.c();
		A.d();
		
	}

}
