//클래스 이름 Student == 파일명,첫문자 대문자  
public class Student {  //클래스
	//멤버변수 영역 - 클래스 범위에 선언, 객체생성 사용, 자동 초기화 
	String name;  //초기값이 없을시 자동초기화 
	int age;
	String address;
	//jdk가 기본생성자를 만들어줌
//	public Student() {} //기본생성자 - 자동초기화 
	//생성자 사용 목적 - 멤버변수를 객체생성하면서 값 설정 ==> 명시적인 생성자 필요 
	//1.명시적 생성자 작성
	public Student(String n, int a, String ar) {
		System.out.println("public Student(String n, int a, String ar)  호출됨======= ");
		name=n;
		age=a;
		address=ar;  //멤버변수에 값 설정 
	}
	//명시적 생성자 작성시, 기본생성자 자동 주입이 안됨. ==> 반드시 기본생성자를 명시적으로 작성 필요 
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("기본생성자 호출됨 ==========================");
	}
	
}
