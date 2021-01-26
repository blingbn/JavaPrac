
public class FlowEx16 {

	public static void main(String[] args) {
		//별찍기
		
		for(int i = 1; i <=5 ; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		for(int s = 1; s<=5; s++ ) {
			for(int k = 1; k<=s; k++) {
				System.out.print("*");
			}System.out.println();
		}	
	}
}
