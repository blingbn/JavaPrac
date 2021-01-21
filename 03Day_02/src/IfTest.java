
public class IfTest {

	public static void main(String[] args) {
		


		//1. 단일 if 문
		/*
		System.out.println("문장1");
		int num = 0;
		if(3 == 13) { //3 == 13일수 없으니 if 무시
			num=10;
			System.out.println("문장2");
			System.out.println("문장2-1");
		}
		System.out.println(num);
		System.out.println("문장3");
		*/
		
		/*
		System.out.println("문장1");
		int num = 0;
		if(3 == 3) { //3 == 13일수 없으니 if 무시
			num=10;
			System.out.println("문장2");
			System.out.println("문장2-1");
		}
		System.out.println(num);
		System.out.println("문장3");
		
		*/
		
		
		
		//2. 단일 if문 홀수 짝수 구하기
		System.out.println("++++++++++++++++++++++++");
		int num2=100;
		int result = num2%2;
		String mesg = "홀수";
		if(result == 0) {
			mesg = "짝수";
		}
		System.out.println(mesg);
		
		
		//3. 단일 if문(대소문자)
		System.out.println("++++++++++++++++++++++++");
		char c = 'a';
		String mesg2 = "대문자"
;
		if((c>='a' && c<= 'z')){
			mesg2 = "소문자";
		}System.out.println(mesg2);
		System.out.println("main종료 ++++++++++++++++");
		
		
		
		

	}

}
