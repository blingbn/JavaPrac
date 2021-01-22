
public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		for(int i = 0; i<5; i++) {
			System.out.println("Hello1 " + i);
			System.out.println("Hello2 " + i);
			if(i==3)continue;
			System.out.println("Hello3 " + i);
			System.out.println("Hello4 " + i);
		}
		
		
		for(int i = 0; i<5; i++) {
			System.out.println("Hello1 " + i);
			System.out.println("Hello2 " + i);
			if(i==3)break;
			System.out.println("Hello3 " + i);
			System.out.println("Hello4 " + i);
		}
		*/
		
		A:
		for(int i =0; i<5; i++) {
			for(int j =0; j<4; j++) {
				System.out.println(i + "\t" + j);
				if(i==3)break A;
			}System.out.println("안쪽 for");
		}
		System.out.println("레이블 바깥쪽");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
