
public class WhileTest {

	public static void main(String[] args) {

		/*
		int n = 1; //초기값
		while(n <= 10) { // 조건
			System.out.println(n + "Hello World");
			n++;//증감식 -> 없을 경우 무한루프
		}
		System.out.println("while문 빠져나옴");
		
		
		*/
		
		
		
		//연습
		//10에서 0으로 감소하면서 while문
		int num = 10;
		while(num>0) {
			System.out.println(num + "Hello World");
			num--;
		}
		System.out.println("while문 빠져나옴");
		

	}

}
