
public class TestMain {

	// 인스턴스 메서드(멤버메서드)
	//가변인자
	public void a(int ... n) {
		for(int x : n) {
			System.out.println(x);
		}
	}
	public void c(String ... n) {
		for(String x : n) {
			System.out.println(x);
		}
	}

	public static void b() {}
	// static 메서드
	public static void main(String[] args) {
		TestMain m = new TestMain();
		m.a(10);
		m.a(10,20);
		m.a(10,9,8);
		m.a(1,2,3,4,5);
		m.a(1,2,3,4,5,6);
		m.c("홍길동", "이순신");
		b(); //static  메소드 
	}//end main
}//end class