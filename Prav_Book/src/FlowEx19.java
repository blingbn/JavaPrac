
public class FlowEx19 {

	public static void main(String[] args) {
		//구구단 2~9단
		
		for(int i = 2; i<=9; i++) {
			System.out.println("==" + i +"단==");
			for(int j = 1; j <= i; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}System.out.println();
				
		}
		
		//같은 식의 또 다른 for 문, 되도록이면 {}을 사용하는게 좋지만 아래처럼도 가능함
		for(int n = 2; n<=0; n++)
			for(int m = 1; m<=n; m++)
				System.out.printf("%d x %d = %d%n",n,m, n*m);
		
	
	
		for(int i=1; i<=3; i++){
			for(int j=1; j<=3; j++) {
				for(int k =1;k<3; k++) {
					System.out.println(""+i+j+k); //""때문에 문자열이 됨
				}
			}
		}
		
	
	
	
		
		
		
	}

		
	
}
