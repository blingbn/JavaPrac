
public class Main {
	
	
	public static void main(String[] args) {
		
		
		int i = 20;
		//i++;
		//i = i + 1;
		i += 2;
		System.out.println(i);
		//System.out.println((100 < i) && (i < 200));
		
	}
	

}
/*
public class Main {
	
	
	public static void main(String[] args) {
		
		//pow�� �ŵ�����
		
		double a = Math.pow(3.0, 20.0);
		
		System.out.println("3�� 20������ " + (int) a + "�Դϴ�.");
		
	}
	

}





public class Main {
	
	
	public static void main(String[] args) {
		
		int x = 50;
		int y = 60;
		
		System.out.println("�ִ��� " + max(x,y) + "�Դϴ�.");
		
	}
	//��ȯ��(int), �Լ��̸�(max), �Ű�����(int a, int b)
		static int max(int a, int b) {
			int result = (a > b) ? a: b;
			//true �� ��� a, false�ϰ�� b�� ��ȯ
			return result;
			
			
		}

	

}

public class Main {
	
	
	public static void main(String[] args) {
		
		
		int a = 50;
		int b = 50;
		System.out.println("a�� b�� ��������? " + (a == b));
		System.out.println("a�� b���� ū����? " + (a > b));
		System.out.println("a�� b���� ��������? " + (a < b));
		System.out.println("a�� b�� �����鼭 a�� 30���� ū����? " + ((a == b) && (a > b)));
		System.out.println("a�� 50�� �ƴѰ���? " + !(a == 50));

	}

}




public class Main {
	

	public static void main(String[] args) {
		
		System.out.println(1 % 3 );
		System.out.println(2 % 3 );
		System.out.println(3 % 3 );
		System.out.println(4 % 3 );
		System.out.println(5 % 3 );
		System.out.println(6 % 3 );

	}

}

public class Main {
	

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("������ a��" + a + "�Դϴ�.");
		a++;
		System.out.println("������ a��" + a + "�Դϴ�.");
		System.out.println("������ a��" + ++a + "�Դϴ�.");
		System.out.println("������ a��" + a++ + "�Դϴ�.");
		System.out.println("������ a��" + a + "�Դϴ�.");
		
		//++�� �ڿ� ���� ��� ����� �� ���Ŀ� 1�� ������.
		//�տ� ++�� ���°�� ��µ� �� 1�� ������.
		

	}

}

public class Main {
	
	final static int SECOND = 1000;
	public static void main(String[] args) {
		
		int minute = SECOND / 60;
		int second = SECOND % 60;
		
		System.out.println(minute);
		System.out.println(second);

	}

}
*/