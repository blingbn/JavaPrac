
public class WorkShop_01 {

	public static void main(String[] args) {
		
		
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		System.out.println("1.println 사용");
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age + "이고 주소는 " + address );
		
		System.out.println("");

		System.out.println("2.print 사용");
		System.out.print("이름은 " +  name + "\n"+ "나이는 " + age + "이고 주소는 " + address + "\n");
		
		System.out.println("");
		
		System.out.println("3.printf 사용");
		System.out.printf("이름은 %s \n나이는 %d이고 주소는 %s", name, age, address);
		System.out.println("");
		System.out.println("");
		
		//2. 정수형 변수에 주민번호를 선언하고 화면에 출력
		long idNumber = 12345678915555l;
		System.out.println("주민번호는 " + idNumber);
		System.out.println("");
		
		
		//3. 다음과 같이 변수에 값이 저장되어 있을 때, 두변수의 값을 바꾸는 코드를 작성 (n에는 20을 저장, n2에는 10이 저장되도록한다.)
		int n = 10;
		int n2 = 20;
		
		int tmp = n; //tmp = 10
		n = n2; // n = 20
		n2 = tmp; // n2 = 10
		System.out.println("n값은 " + n);
		System.out.println("n2값은 " + n2);
		System.out.println("tmp값은 " + tmp);
	}

}
