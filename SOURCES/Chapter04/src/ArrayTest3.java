
public class ArrayTest3 {

	public static void change1(int n) {// 정수하나를 매개변수로 받아서 사용 후 반환(리턴값)은 없음 (void)
		n = 20;//call by value
	}
	public static void change2(int [] num) { //int 배열을 매개변수로 받아서 사용 후 반환(리턴값)은 없음 (void)
		num[2] = 90;//call by ref
	}
	//위 두함수는 원래 new를 사용하여 객체 생성후 사용해야하는데 static때문에 그냥 호출 사용할 수 있음.
	
	
	public static void main(String[] args) {
		/*
		 기본형 데이터 : 함수 호출 매개변수로 넘겨줄때 call by value 사용 : 값을 복사 사용
		int xxx = 10; // main 함수 안에서만 사용가능한 변수 : 로컬변수(함수안에서만 사용가능)
		System.out.println("호출전 : "+ xxx); call by value : 값의 복사 후 사용 : pdt값의 복사 저장 후 사용
		
		change1(xxx);
		System.out.println("호출후 : "+ xxx);
		*/
		
		
		
		//참조형 데이터 : 주소들어있는 데이터 call by ref
		int [] num = new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		System.out.println("main=========" + num);
		System.out.println("호출전 : "+ num[2]);
		change2(num);
		System.out.println("호출후 : "+ num[2]);
	}

}
