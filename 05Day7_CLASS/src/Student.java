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
	public Student() {//개발자가 작성한 기본생성자
		System.out.println("기본생성자 호출 됨==============");
		name="홍길동";  //멤버변수 초기화 
		age=100;
		address="제주";
		System.out.println("기본생성자 호출 완료 =============");
	}
	//함수영역, 메소드영역
}
