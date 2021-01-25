
public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		
		num = new int[4];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		
		for(int x : num) {
			System.out.println("for-each"+x);
		}
		
		//for문 사용
		for(int i = 0; i<num.length; i++) {
			System.out.println("for문"+num[i]);
		}
		
		
		//String 배열
		String [] names = new String[2];
		names[0] = "aa";
		names[1] = "bb";
		
		for(String s : names) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
	}

}
