
public class Main {
	
	
	public static void main(String[] args) {
		double b = 0.5 ;
		int a = (int) (b + 0.5);
		//(int)�� �ϸ� �������� �Ǽ������� ��ȯ�� �� ����.
		//�ݿø��� �� = (int) (�Ǽ� + 0.5) ;
		System.out.println(a);
		
	}

}

/*
public class Main {
	
	
	public static void main(String[] args) {
	
		int a = 1;
		int b = 2;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		
		
		// a + b�� �� 12�� �ǰ� (a + b)�� 3�� ������ ?
	}

}


public class Main {
	
	final static int INT_MAX = 2147483647;
	
	public static void main(String[] args) {
	
		int a = INT_MAX ;
		System.out.println(a + 1);
		
		// int ���� ��� -2147483647 ~ 2147483647�� ���� ����
		//�� ���� ��� ��� ���� ���� �� �Ǵ� ���� ū������ ���ư�. ��ȯ���� ��
		//�̰� overflow��� ��.
	}

}


public class Main {
	
	final static double PI = 3.141592;
		
	//final�� �ѹ� ������ �Ǹ� ���� �ٲ�� ���� = ���
	//static �ϳ��� Ŭ�������� �����ϴ� Ŭ����
	//double�� �Ǽ��� ��Ÿ���� �ڷ���
	public static void main(String[] args) {
	
		int r = 30;
		System.out.println(r * r * PI);
		
		
	}

}

public class Main {

	public static void main(String[] args) {
		
		int intType = 100;
		// �������� ��Ÿ���� �ڷ��� int
		double doubleType = 150.5;
		//�Ǽ����� ��Ÿ���� �ڷ��� double
		String stringType = "�̺���";
		//���ڿ��� ��Ÿ���� �ڷ��� String
		//String, Array�� ��� ����������̱⶧���� �빮�ڷ� ������
		
		System.out.println(intType);
		System.out.println(doubleType);
		System.out.println(stringType);
	}

}
*/