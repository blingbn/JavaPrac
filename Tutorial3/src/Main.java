
public class Main {

	public static void main(String[] args) {
		
		String name = "John Doe";
		System.out.println(name);
		System.out.println(name.substring(0, 1));
		System.out.println(name.substring(2, 8));
		//substring(n1,n2);의 경우
		//n1은 0번부터 시작해서 몇번째인지
		//n2는 첫번째 글자부터 몇번째인지
		
	}

}

/*
public class Main {

	public static void main(String[] args) {
		
		int a = 200;
		System.out.println("10진수 : " + a);

		System.out.format("8진수 : %o\n", a);
		System.out.format("16진수 : %x", a);
		
	}

}



public class Main {

	public static void main(String[] args) {
		
		for(char i = 'a'; i <= 'z'; i++)
		{
			System.out.print(i + " ");
		}
	}

}



public class Main {

	public static void main(String[] args) {
		
		double a = 10.3;
		double b = 9.6;
		double c = 10.1;
		
		System.out.println((a + b + c) / 3);
		

	}

}
*/