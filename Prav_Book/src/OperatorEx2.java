
public class OperatorEx2 {

	public static void main(String[] args) {
		// 연산자2
		
		int i = 5;
		int j = 0;
		
		j = i++; // j = i + 1
		
		System.out.println("j = i++; 실행 후 , i = " + i + ", j =" + j); // j = 5, i = 6 
		
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j = ++i; 실행 후 , i = " + i + ", j =" + j); // j = 6 , i = 6
		
		

	}

}
