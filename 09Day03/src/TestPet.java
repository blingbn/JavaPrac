
public class TestPet {

	public static void main(String[] args) {
		
		Pet c = new Cat("나비", 3, "암컷");
		System.out.println(c);
		c.cry();
		c.eat();
		c.sleep();
		
		Pet d = new Dog("하루", 2, "블랙");
		System.out.println(d);
		d.cry();
		d.eat();
		d.sleep();
		
		//pet타입의 배열에 고양이, 개 추가
		
	
	}

}
