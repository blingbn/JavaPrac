//클래스 이름 Student == 파일명,첫문자 대문자  
public class Student {   //모델 클래스 학생한명 객체를 생성, 저장할 모델클래스
	//멤버변수영역, 인스턴스변수 
	//객체생성- 객체가 모두 가지는 공통 변수 선언 : 접근지정자 타입 변수명;
	//멤버변수 : 객체생성 후 사용 (new로 객체생성 ), 객체생성시에 자동 초기값으로 설정 
	//멤버변수 : 클래스 블럭안에 선언 , 클래스안의 함수, 클래스안의 생성자에서 모두 사용가능 
	String name;//이름  초기값 지정
	int age; //나이 
	String address;// 주소 	
	//생성자(constructor)영역 :멤버변수를 최초(객체생성시 ) 초기화하는 역할
	//접근지정자 클래스이름(){}  ==> 기본생성자 (default constructor)
	//기본생성자 : 개발자 미작성시  jdk가 자동만들어 코드에 넣어줌 :안적어주어도 자동클래스에 
	//기본생성자를 가지게해줌
	//다른 클래스에서 new Student()로 기본생성자 호출 -> 객체 생성 사용 가능함
	//개발자가 생성자를 명시적으로 작성, 선언-> jdk 하던 기본생성자를 만들고 코드에 넣어주는 작업을 안함.
	
	public Student(String n) {//매개변수를 받는 생성자를 명시적 작성, jdk가 기본생성자 안만들어줌
		System.out.println("매개변수 1개짜리 생성자 호출됨 =======================");
		name= n;//멤버변수 name을 매개변수 값으로 초기화 
	}
	// 명시적 생성자를 작성시에 jdk 만들어 주지 않는 기본생성자를 명시적으로 반드시  기재 줄것. 
	public Student() {
		System.out.println("기본 생성자 호출됨 =======================");
	}//기본생성자를 명시적으로 기재하여 기본생성자를 사용하여 객체를 생성할 수 있도록 해주었음
	
	//1. 명시적 생성자 작성이 없으면 , 기본생성자가 자동생성되서 new 기본생성자()로객체 생성할 수 있음.
	//2. 명시적으로 생성자 작성 -> 기본생성자 생성 안됨.  new 기본생성자()로객체 생성할 수 안됨.
	//3. 명시적으로 생성자 작성시 new 기본생성자()사용 객체생성 가능하도록 명시적으로 기본생성자를 만들어 줄것 
	
	//함수영역, 메소드영역
}