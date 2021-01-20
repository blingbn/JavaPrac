
public class Sample02_variable5_1 {

	public static void main(String[] args) {
		
		
		
		
		//자바는 블럭 scope (스크립트는 함수 scope)
		
		int num1 = 100; //main전체 scope, x·y 전체에서 사용가능
		{//x 블럭
			
			int num = 10;
			System.out.println(num);
			System.out.println("x블럭 num1 =========" + num1);
		}
		
		//System.out.println(num); x 블럭안에서만 사용가능하므로 불가
		
		{//y 블럭
			
			int num = 20;
			System.out.println(num);
			System.out.println("y블럭 num1 =========" + num1);
			
		}
	}

}
