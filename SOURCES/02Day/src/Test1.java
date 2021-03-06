
public class Test1 {

	public static void main(String[] args) {
		
		
		int a = 10; // a변수 사용 scope 가 main 함수 전체
		
		System.out.println("1.=====" + a);
		
		{//2. 블럭 시작
			
			int b = 20; //2. 블럭 안에서 선언됐으므로 2.블럭 밖은 사용불가 
			System.out.println("2.======" + a); // main함수 안에 있으므로 a 사용 가능
			System.out.println("3.========" + b); 
		}// 2. 블럭 끝
			
		//System.out.println("3.========" + b); //오류 2.블럭의 scope 밖에 존재
		
		/*
		 int a = 10; // a변수 사용 scope 가 main 함수 전체
		
		System.out.println("1.=====" + a);
		int b ;
		{//2. 블럭 시작
						
			b = 20; //2. 블럭 안에서 선언됐으므로 2.블럭 밖은 사용불가 
			System.out.println("2.======" + a); // main함수 안에 있으므로 a 사용 가능
			System.out.println("3.========" + b); 
		}// 2. 블럭 끝
			
		System.out.println("3.========" + b); //사용가능, 선언이 어디서 됐냐가 중요하고, 초기화는 상관없음
		
		 
		 
		 * */
		
	}

}
