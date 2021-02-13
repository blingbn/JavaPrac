
public class IFTest2 {

	public static void main(String[] args) {

		//2.  if~else문
		System.out.println("문장1");
		int num =0;  //변수선언
		if(3==3) {
			num=3;  //초기화
			System.out.println("참");
			System.out.println("참2");
			System.out.println(num);
		}else {
			System.out.println("거짓");
			System.out.println("거짓2");
		}
		System.out.println(num);
		System.out.println("문장3");
		
		//3.단일 if문(대소문자 판단)
		System.out.println("++++++++++++++++++++++++");
		char c='a';
		int intc=97;
		String mesg2="";
		if((intc>='a'&&intc<='z')) {
			
			mesg2="소문자";
		}else {
			mesg2="대문자";
		}
		System.out.println(mesg2);
		System.out.println("main종료 ==============");
		
	}

}
