
public class Student {
	//이름, 나이, 주소, ssn 변수 선언
	//4개의 값을 초기화 할 수 있는 생성자 작성 
	//1. 멤버변수
	String name;
	int age;
	String address;
	String ssn;
	public Student(String name, int age) {
		this(name, age, "경기", "???????????"); //매개변수 4개짜리 호출 생성
		System.out.println("Student(String name, int age) 생성자 호출 ");
	}	
	
	public Student(String name) {  //매개변수 1개 짜리 명시적 생성자 
//		this(name,10, "서울", "??????????" );	//클래스 안의  다른 생성자를 클래스 안에서 직접 호출 사용: 생성자의 맨첫줄에 작성  
		this(name,10 );	//클래스 안의  다른 생성자를 클래스 안에서 직접 호출 사용: 생성자의 맨첫줄에 작성  
//		this.name=name;//매개변수값으로 멤버변수에 설정 
//		this.age=10;
//		this.address="서울";
//		this.ssn="??????????";
		System.out.println("public Student(String name)  호출됨 ");
		
	}
	//명시적  생성자
	public Student(String name, int age, String address, String ssn) {
		System.out.println("Student(String name, int age, String address, String ssn)==== 호출 ");
		this.name=name;
		this.age=age;
		this.address= address;
		this.ssn= ssn;
	}
	public Student() {
		System.out.println("기본생성자 호출 ======================");
	}//기본생성자 반드시 추가 !!!!!!!
	//	

	


}
