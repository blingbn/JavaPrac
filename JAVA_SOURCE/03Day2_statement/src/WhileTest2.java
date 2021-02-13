import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		//반복문을 이용한 누적 
//0~10 까지의 합계 : 55
	
	int num=0;  //증가값 
	int sum=0;  //누적된 합계 
	while(num<=10) {//0~10
		sum+=num;
		num++;
	}
	System.out.println(sum);
	  
	}//end main
}//end class
