
public class ForTest2 {

	public static void main(String[] args) {
		// for문 연습
		
		/*
		//1. for문 
		for(int i = 0; i<5; i++) {
			for(int j=0; j<4; j++) {
				System.out.println(i+ "\t" + j);
			}
		}
		*/
		
		/*
		//2. 
		for(int i = 0; i<5; i+=2) {
			System.out.println("hello" + i);
		}
		*/
		//3.
		int i = 0;
		int j = 0;
		for(i=0, j=0; i<5 && j<3; i++,j++) {
			System.out.println(i + "happy " + j);
		}
		System.out.println(i);
		
		
		//4.
		for(int i2 = 10; i2>0; i2--) {
			System.out.println("world" + i2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
