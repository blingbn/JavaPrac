class SuperClass{
	public void a() throws NullPointerException {}
	public void b() throws Exception {}
	public void c() throws ArithmeticException {}
}
class SubClass extends SuperClass{

	@Override
	public void a()  {}

	@Override
	public void b() throws RuntimeException {}

	//@Override
	//public void c() throws Exception {} //부모보다 큰걸 throws하므로 오류 ArithmeticException로 변경해야함.
	
}


public class Ex09_6 {
	public static void main(String[] args) {}
}
