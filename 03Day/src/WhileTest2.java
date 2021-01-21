
public class WhileTest2 {

	public static void main(String[] args) {
		// 반복문을 이용한 누적
		
		/*
		int num = 0; //증가값
		int sum = 0; //누적합계
		while(num <= 10) {
			sum+=num; //sum = sum+num  
			num++;
		}
		*/
		
		
		/*
		//10~0까지의 합계
		
		int num = 10;
		int sum = 0;
		while(num>0) {
			sum+=num; // sum = sum + num 
			num--;
		}
		System.out.println(sum);
		
		*/
		/*
		//10~0까지 중 짝수의 합계
		
		int num = 10;
		int sum = 0;
		while(num>0) { //짝수만 더하게
			if((num%2) == 0) {
				sum +=num;
			}
			num--;
		}
		System.out.println(sum);
		*/
		/*
		//while문 0~10
		int n = 0;
		while(n<11) { // 0~ 10
			System.out.println("hello " + n);
			n++;
		}
		*/
		
		
		/*
		//do while문
		
		int n2 = 0;
		do {
			System.out.println("world" + n2);
			n2++;
		}while(n2<5);
		*/
		
		/*
		//do while문 1~100 총합
		int num = 1;
		int sum = 1;
		do {
			sum+=num;
			num++;
		}while(num<101);
		
		System.out.println(sum);
		*/
		
		/*
		//do while 1~100까지의 총합 중 3의 배수가 아닌 값들만 
		int num = 1;
		int sum = 0;
		
		do{
			if(num%3!=0) {
				sum+=num;
				
			}
			num++;
		}
		while(num<=100);
		System.out.println(sum);
		*/
		
		/*
		int num = 1;
		int sum = 0;
		
		do {
			if(num%3 == 0) {
				sum+=num;
				}
			num++;
		}while(num<=100);
		System.out.println(sum);
		*/
		
		
		int n3 = 1;
		int sum = 0;
		int sum2 = 0;
		do {
			if(n3%3!=0) {
				sum+=n3;
			}else {
				sum2+=n3;
			}
		}while(n3<101);
		System.out.println(n3);
		
		
	}

}
