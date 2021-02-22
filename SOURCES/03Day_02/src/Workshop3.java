
public class Workshop3 {

	public static void main(String[] args) {


		//test01
		
		int inx = 15;
		/*
		//1. int형 변수 inx가 10보다 크고 20보다 작을 때 true인 조건식
		if(( inx > 10 )&& ( inx < 20 )) {
			System.out.println("true");
		}
		*/
		
		/*
		//2. char형 변수 ch가 공백이아니거나, 탭이 아닐 때 true인 조건식
		char ch1 = ' ';
		
		if(ch1 != ' '|| ch1 != '\t') {
			System.out.println("true");
		}
		*/
		
		
		/*
		//3. char형 변수 ch가 x 또는 X일때 true인 조건식
		char ch2 = 'x';
		
		if(ch2 == 'x'||ch2 == 'X') {
			System.out.println("true");
		}
		*/
		
		/*
		//4. 
		char ch3 = '0';
		if(ch3 >= '0' && ch3 < '9') {
			System.out.println("true");
		}
		*/
		
		/*
		//5. 
		char ch4 = 'a';
		if((ch4>='a' && ch4 <='z') || (ch4>='A' && ch4 <='Z') ) {
			System.out.println("true");
		}
		*/
		
		/*
		//6. 
		int year = 400;
		if(year%400 == 0 || (year%4==0 && year%100 !=0)) {
			System.out.println("true");
		}
		*/
		
		/*
		//7.
		boolean powerOn = false;
		if(powerOn == false) {
			System.out.println("true");
		}
		*/
		
		
		/*
		//문제2
		int sum = 0;
		for(int i =1; i <= 20; i++){
			if(i%2!=0 && i%3!=0) {
				sum += i;
			}
		}System.out.println(sum);
		*/
		
		
		/*
		//문제3
		//다음for문을 while문으로
		
		int i = 0;
		while(i <= 10) {
			int j = 0;
			while(j<=i) {
				System.out.print('*');
				j++;
			}i++;
			System.out.println();
		}
		
		*/
		
		
		
		for(int i = 1; i <= 5; i++ ) {
		
			for(int j = 5; j>=0 ; j--) {
			
				int sum = i + j;
				
				if(sum == 6) {
					System.out.println(i+"+"+j+"="+sum);
					
				}
			}
		}
		
		/*
		for(int i =1; i<=6; i++) {
			for(int j = 1; j <= 6; j++) {
				if((i+j)==6)
					System.out.println(i + "+" + j + "="+ (i+j));
			}
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
