
public class Test2 {//권장하지않는방법

	
	public static void a() throws Exception{
		b();
	}
	public static void b() throws Exception{
		//int num = 3 / 0;
		String name = null;
		System.out.println(name.length());
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			a();
		}catch (Exception e) {
			System.out.println("main======== exception" + e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}
}

