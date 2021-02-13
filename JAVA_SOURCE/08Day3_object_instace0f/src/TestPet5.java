
public class TestPet5 {

	public static void main(String[] args) {
	
		// 다형성 대표적인 예
		//1. 배열
		Pet [] c = { 
				     new Cat("야옹이", 3, "암놈"),
				     new Cat("야옹이", 3, "암놈"),
		             new Dog("누렁이", 8, "암놈", "검정"),
		             };
		for( Pet  x:c) {
		  //타입 체크 instanceof 연산자
			if(x instanceof Cat) {
				System.out.println("Cat");
			}else if(x instanceof Dog){
				System.out.println("Dog");
			}else if(x instanceof Pet){
				System.out.println("Pet");
			}
		}

		
		
	}

}
