public class Main{
	

	
	public static void main(String[] args) {
		
		
		
		
	}
}


/*
public class Main{
	
	
	public static void main(String[] args) {
		
		int count = 0;
		
		for(;;) 
		{
			
			System.out.println("���");
			count++;
			if(count == 10) {
				break;//break�� ������� ���ѷ���
			} 
		}
		
		
	}
}


public class Main{
	
	final static int N = 15;
	
	public static void main(String[] args) {
		
		
		// x^2 + y^2 = r^2
		for(int i = -N; i <= N; i++) 
		{
			for(int j = -N; j <= N; j++) 
			{
				if(i * i + j * j <= N * N) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
}


public class Main{
	final static int N = 30;
	public static void main(String[] args) {
		//for�� : �ʱ�ȭ�κ�, ���Ǻκ�, ����κ�
		for(int i = N; i>0;  i--) {
		
			//System.out.println("*" );
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

public class Main{
	
	public static void main(String[] args) {
		
		int i = 1, sum = 0;
		//System.out.println(sum += i++);
		//����� �Ŀ� 1�� ���� �ִ°ű⶧���� i = 1���� ����, ��µ� �Ŀ� 2�� ����ǹǷ� sum�� 2�� ��.
		while( i <= 1000) {
			sum += i++; //�ݺ��� while�� ()�ȿ� ���� ���ϰ�쿡 �Ʒ��� ����Ǵ°�
		}
		System.out.println("1���� 1000������ ���� " + sum + "�Դϴ�." );
		
	}
}


public class Main {

	public static void main(String[] args) {
		
		String a = "Man";
		int b = 0;
		
		//�ڹٴ� String�� ���� �� equal()�� �̿�
		//String�� �ٸ��ڷ������� �ٸ� ���ڿ� �ڷ����̱� ����
		
		if(a.equals("Man")) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		
		if(b == 3) {
			System.out.println("b�� 3�Դϴ�.");
		}else {
			System.out.println("b�� 3�� �ƴմϴ�.");
		}
		
		if(a.equalsIgnoreCase("man") && b == 0){
			System.out.println("���Դϴ�.");
		}else {
			System.out.println("�����Դϴ�..");
		}
	}

}

public class Main {

	public static void main(String[] args) {
		
		int score = 95;
		
		if(score >= 90){
			System.out.println("A+�Դϴ�.");
		}else if(score >= 80){
			System.out.println("B+�Դϴ�.");
		}else if(score >= 70){
			System.out.println("C+�Դϴ�.");
		}else {
			System.out.println("F�Դϴ�.");
		}

	}

}
*/