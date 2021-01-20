
public class Instance_Test_3 {

	//class 블럭에 선언
			//함수에서 그냥 사용할 수 없음 / 속한 클래스를 객체생성호 참조변수 이용하여 사용
	//Class에 있는 변수들은 명시적 초기화가 필요x					
	String name;
	char gender;
	int age;
	
	//String -> null, 정수형 - > 0, 실수형 -> 0.0 문자 -> 공백으로 자동 초기화 됨
	
	public static void main(String[] args) {
		
		Instance_Test_3 ref = new Instance_Test_3();
		
		System.out.println(ref.name + "\t" + ref.gender + "\t" + ref.age);
		
		ref.name = "홍길동";
		ref.gender = '남';
		ref.age = 10;
		
		System.out.println(ref.name + "\t" + ref.gender + "\t" + ref.age);
		

	}//main 블럭

}//class 블럭
