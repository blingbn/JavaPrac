
public class ForTest {

	public static void main(String[] args) {
		// for문 연습
		
		//
		/*
		A:
			for(int i = 0; i < 5; i++){
				for(int j = 0) {
					
				}
		}
		
		*/
		
		int count = 0;
		for(int i =0; i<5; i++) {
			System.out.println("hello " + i);
			count++;
			if(i==3) break;
		}
		System.out.println(count);
		System.out.println("main종료=====");
		
		
		

	}

}
