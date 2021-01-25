
public class Ex05_4 {

	public static void main(String[] args) {
		//new키워드와 리터럴을 혼합하는 방법
		
				//데이터형 [] 배열명;
				//배열명 = new 데이터형[]{값1,값2,값3};
				
				int []num;
				num = new int[] {1,2,3};
				
				for(int x : num) {
					System.out.println(x);
				}
				
				String []name;
				name = new String[] {"홍길동", "이순신", "유관순"};
				
				for(String s : name) {
					System.out.println(s);
				}
				

	}

}
