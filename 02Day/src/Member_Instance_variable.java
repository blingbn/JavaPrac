
public class Member_Instance_variable {

	

	//변수 선언 위치 - 함수 안  or    class 블럭 안
	
	int memberNum = 10; // class안에 선언된 변수는 반드시 객체생성(new)을 해서 사용해야함 // 멤버변수 or 인스턴스변수라고 부름
	
	public static void main(String[] args) {//main함수시작
		//1. 멤버변수가 속한 클래스인 객체 생성
		
		Member_Instance_variable ref =new Member_Instance_variable(); // 1. new를 통한 객체생성
		
		System.out.println(ref); //객체를 참조하고 있는 ref변수의 객체주소가 저장되어 있음.
		
		
		//2. 참조변수이용하여 참조변수.인스턴스변수이름으로 사용
		System.out.println(ref.memberNum);
		//System.out.println(memberNum); // 어느주소에 있는 객체인지 알 수가 없음
		
		

	}//main함수 블럭

	
	
}//class 블럭
