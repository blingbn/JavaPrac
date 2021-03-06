
public class Instance_Test_2 {

	//class 블럭에 선언
			//함수에서 그냥 사용할 수 없음 / 속한 클래스를 객체생성호 참조변수 이용하여 사용
			
			
			
	String name = "홍길동";
	char gender = '남';
	int age = 10;
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Instance_Test_2 ref = new Instance_Test_2();
		
		System.out.println(ref.name + "\t" + ref.gender + "\t" + ref.age);
		
		
		//함수안에 선언된 변수를 '로컬변수' 라 함, 선언된 위치에서만 사용 가능 
		
		/*
		 로컬 변수 특징 
		 1. 함수안에 선언, main안에서만 사용 가능 
		 2. 사용전 반드시 선언 및 초기화값이 필요
		 * */
//		String name = "홍길동";
//		char gender = '남';
//		int age = 10;
//		
		
		
		
		
		
		
		

	}//main 블럭

}//class 블럭
