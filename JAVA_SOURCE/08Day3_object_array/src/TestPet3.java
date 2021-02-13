
public class TestPet3 {

	public static void main(String[] args) {
	
		
		Object [] c = {
					 10,
					 "홍길동",
				     new Cat("야옹이", 3, "암놈"),
				     new Cat("야옹이", 3, "암놈"),
		             new Dog("누렁이", 8, "암놈", "검정"),
		             };
		
		Object x = 10;
		x ="홍길동";
		x = 3.123;
		x =true;
		x = new Cat("야옹이", 3, "암놈");
		
		// 다형성 대표적인 예
		// 2. 메서드의 파라미터 변수
		// equals() ==> 값 비교

		System.out.println("10".equals("10")); //문자열
		System.out.println(x.equals(x));  // Cat
		
				

		
		
	}

}
