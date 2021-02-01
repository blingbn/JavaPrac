
public class prac1 {

	public static void main(String[] args) {
		  int[] score = new int[5];
		  int k = 1;
		  
		  score[0] = 50;
		  score[1] = 60;
		  score[k+1] = 70;
		  score[3] = 80;
		  score[4] = 90;
		  
		  
		  int tmp = score[k+2]+score[4];
		  System.out.println(tmp);
		  
		  
		  int sum = 0;
		  
		  //for 문 사용시
		  for (int i = 0; i<5; i++) {
			  System.out.println(score[i]);
			  sum += score[i];
			  
		  }
		  System.out.println(sum);
		  
	}

}
