
public class Ex05_20 {
	
	public Ex05_20() {
		System.out.println("Ex05_20 생성자");
	}
	//static블록
	static {
		System.out.println("static 블록은 프로그램 실행시 실행");
	}
	//instance 블록
	{
		System.out.println("instance블록은 프로그램 실행시 실행");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main 메소드 실행");
		Ex05_20 ex = new Ex05_20();
		Ex05_20 ex2 = new Ex05_20();
	}

}
