
public class CastingTest {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine(); //객체생성
		FireEngine fe2 = null; 
		
		fe.water();
		car = fe; // car = (Car)fe;//형변환 생략 업캐스팅
		fe2 = (FireEngine)car;// 다운캐스팅
		fe2.water();
	}

}


class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("Drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("Water!!!");
	}
}