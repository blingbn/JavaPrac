
public interface A {

	int NUM =10; //public static final 자동으로 지정된다.
	public abstract void a();
	void b(); // public abstract 자동으로 지정된다.
	
	public default void c() {
		System.out.println("c");
	}
	public static void d() {
		System.out.println("d");
	}
	//public  void e() {}  //일반메서드 불가
}
