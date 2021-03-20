
public class TestPet {

	public static void main(String[] args) {
		
		Pet c = new Cat("야옹이", 3, "암놈");
		//System.out.println(c.xxx);  //동적 바인딩 발생안됨
		
		System.out.println(c.toString()); // toString()
		c = new Dog("누렁이", 8, "암놈", "검정");
		System.out.println(c.toString());

		//동적 바인딩(dynamic binding): 메서드에서만 발생됨.
		//: 컴파일때와 실행할때의 자바가 인지하는 메서드가 다르다.
		// 즉 컴파일때는 Pet의 toString()로 인식하고컴파일된다.
		//  실행때는 자동으로 실제new한 객체의 toString()를 호출한다.
		
		
		
	}

}
