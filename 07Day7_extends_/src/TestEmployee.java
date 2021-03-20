
public class TestEmployee {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		Manager m2 = new Manager("A01","홍길동","서울","개발");

		System.out.println(m2.getSsn());
		System.out.println(m2.getName());
		System.out.println(m2.getAddress());
		System.out.println(m2.getDepart());
		
	}

}
