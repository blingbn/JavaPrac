
public class DoubleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for(int i = 1; i <= 2; i++) {
			for(int j = 1; j<3; j++) { // 중첩 for문
				System.out.println("i값은" + i);
				System.out.println("j값은" + j);
			}
		}
		*/
		/*
		for(int i = 2; i <= 2; i++) {
			for(int j = 1; j<10; j++) { // 중첩 for문
				System.out.println(i +"x" + j + "="+ i*j);
				
			}
		}
		*/
		
		/*
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j<10; j++) { // 중첩 for문
				System.out.println(i +"x" + j + "="+ i*j);
				
			}
			System.out.println("\n");
		}
		*/
		
		/*
		//별그리기 연습
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}				
			System.out.println();
		}
		
		*/
		
		
		for(int i=1;i<=3; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
				
		
	}

}
