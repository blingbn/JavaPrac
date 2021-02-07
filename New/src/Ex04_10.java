
public class Ex04_10 {

	public static void main(String[] args) {
		//for문을 이용한 실수 구하기
		
		int total = 0;
		
		for (int i = 1; i <= 10; i+=2) {
			total+=i;
		}System.out.println(total);
		
		for(int i = 0; i<=10; i++) {
			if(i%2!=0) {
				System.out.println(i + "홀수");
			}else {
				System.out.println(i + "짝수");
			}
		}
	}

}
