
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1. 배열 선언
		//데이터타입 [] 변수명;
		//int[] num;
		
		int num[]; // num은 int자료를 여러개 저장 - 배열 int[]
		
		//2. 배열 생성
		//변수명 = new 데이터타입[크기];
		num = new int[3];// int 담을 방을 3개 생성, 방마다 타입의 기본값으로 초기화
		
		//3. 배열초기화(방 - 값을 저장 : 방번호 - index사용 : 0부터 시작)
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		//num[3] = 40; // 런타임오류 : java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(num);
		System.out.println(num[0]+"\t"+num[1]+"\t"+num[2]+"\t");
		
		//for문을 활용한 출력
		
		for (int i = 0; i < 3; i++) {//i = index번호
			System.out.println("num["+i+"]"+"\t"+num[i]);
		}
		
		System.out.println("num.length===="+num.length);
		for(int i=0; i <num.length; i++) {
			System.out.println("num["+i+"]"+"\t"+num[i]);
		}
		
		
		System.out.println("=======================");
		for(int i : num) {//forEach num-> 배열 / i -> 배열방에서 꺼내온 값
			System.out.println(i);
		}
		
		
		
	}

}
