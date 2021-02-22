
public class Test3 {

	public static void main(String[] args) {
		//증감연산자 test
		
		
		
		
		
		/*
			int a = 0;
			int result = ++a;
			
			System.out.println(a); // a = 1 -> int result = ++ a 에  1을 더하고 a 값을 사용하므로 a = 1 
			System.out.println(result); // 1+ a 를 한 값이 result
			
		 	++a 의 steps
		 	int a = 0;
		 	a+=1;
		  	int result = a;
		
		 */
		
		int a = 0;
		int result = a++;
		
		System.out.println(a); // a = 1 
		System.out.println(result); // a값을 result에 먼저 저장하므로 result = 0, a = 1
		
		
		/* a++ 의 steps
		  int a = 0;
		  int result = a;
		  a = a+1;
		  
		 */
	}

}
