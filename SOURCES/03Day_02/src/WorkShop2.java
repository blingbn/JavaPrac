import java.util.Scanner;
public class WorkShop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		
		
		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		char c1 ='A';
		char c2 ='B';
		char c3 ='1';
		char c4 ='2';
		int inx = 2;
		
		System.out.println(s1+s2); //12
		System.out.println(!bnx); // true
		System.out.println(c1+c2); // 131
		System.out.println(c4+1); // 51
		System.out.println(c4*2-1); // 99
		
	
	*/
		/*
		int num = 456;
		int result = (num/100)*100;
		System.out.println(result);
		*/
		
		/*
		
		//대문자 또는 소문자일 경우만 true
		char ch = 'z';
		boolean b = ('a' <= ch && ch <='z') || ( 'A' <= ch == ch <= 'Z');
		System.out.println(b);
		*/
		
		/*
		//화씨를 섭씨로
		int fahrenheit = 100;
		float celcius = ((float)5/9) * (fahrenheit-32);
		//float celcius = (5/9f * (fahrenheit-32));
		System.out.println("Fahrenheit:" + fahrenheit);

		System.out.println("Celcius:" + celcius);
		*/
		
		/*
		//문제 5. 출력
		
		byte a = 10;
		byte b =20;
		byte c = (byte)(a+b);
		char ch ='A';
		ch = (char)(ch+2);
		float f = 3f/2 ;
		long l = 3000l*3000*3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d == f2;
		System.out.println("c=" + c);
		System.out.println("ch=" + ch);
		System.out.println("f=" + f);
		System.out.println("l=" + l);
		System.out.println("result=" + result);
		*/
		
		/*
		6. 
		int i =5;
		String result = ((i%2) == 1)? "홀수" : "짝수";
		System.out.println("숫자 " + i +"는 " + result + "입니다." );
		*/
		
		/*
		//7. 
			
		Scanner scan = new Scanner(System.in);//콘솔입력사용 객체 생성
		
		System.out.println("이름을 입력하세요");
		String name = scan.next(); //콘솔의 입력내용을 문자열로 가져옴
		System.out.println("나이를 입력하세요");
		int age = scan.nextInt();
		
		System.out.println("입력하신 이름은 "+ name + ", 나이는" + age + "입니다.");
		//System.out.printf("이름은 %s, 나이는 %d 입니다", name, age);
		scan.close();
		*/
		
		/*
		//8.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		String num1 = scan.next();
		System.out.println("정수를 입력하세요");
		String num2 = scan.next();
		
		int result = Integer.parseInt(num1)+Integer.parseInt(num2);
		System.out.println("정수3과 정수5의 합계 : " + result);
		*/
		
		
		
		/* 8번
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int n = scan.nextInt();
		System.out.println("정수를 입력하세요");
		int n2 = scan.nextInt();
		
		int max = (n>n2)? n : n2;
		System.out.println("정수 %d와 정수%d 중에서 최대값 : %d", n, n2, max);
		
		//if 사용
		max = n;
		if(max<n2) {
			max=n2;
		}
		System.out.println("2. if사용 최대값" + max);
		
		//if-else
		if(n<n2) {
			max=n2;
		}else {
			max=n;
		}
		*/
		
		
		/*
		//9. 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		String num1 = scan.next();
		System.out.println("정수를 입력하세요");
		String num2 = scan.next();
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		
		int result = (num3 > num4)? num3 : num4;
		
		System.out.println("정수 " + num1 + "과 정수 " + num2 +"중에서 최대값 : " + result);
		
		
		if(num3 > num4) {
			System.out.println("정수 " + num1 + "과 정수 " + num2 +"중에서 최대값 : " + result);
		}
		*/
		
		/*
		//11.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("주소를 입력하세요");
		String str = scan.nextLine(); //한줄 전체를 받는 것
		int a = str.length();
		System.out.println(str.length());
		System.out.println(str.split(" ").length);
		*/
		
		/*
		//12.
		String mesg = "heLLO";
		
		System.out.println(mesg.toUpperCase());
		System.out.println(mesg.toLowerCase());
		System.out.println(mesg.length());
		System.out.println(mesg.indexOf("e"));
		*/
		
		/*
		//15.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		String str1 = scan.next();
		
		System.out.println("정수를 입력하세요");
		String str2 = scan.next(); 
		System.out.println("정수를 입력하세요");
		String str3 = scan.next(); 
		
		int num4 = Integer.parseInt(str1);
		int num5 = Integer.parseInt(str2);
		int num6 = Integer.parseInt(str3);
		
		int max = (num4>num5)? ((num4>num6)? num4 : num6) : ((num5>num6)? num5 : num6);
		
		System.out.printf("정수%d와 정수%d, 정수%d 중에서 최댓값 %d", num4, num5, num6, max );
		*/
		
		
		/*
		//2번째방법
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int n = Integer.parseInt(scan.next());
		
		System.out.println("정수를 입력하세요");
		int n2 = Integer.parseInt(scan.next());
		
		System.out.println("정수를 입력하세요");
		int n3 = Integer.parseInt(scan.next());
		
		int max = (n>n2)? ((n>n3)? n: n3):(n2>n3)? n2:n3;
		System.out.printf("정수%d와 정수%d, 정수%d 중에서 최댓값 %d", n, n2, n3, max );
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
		
}
