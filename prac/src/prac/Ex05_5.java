package prac;

public class Ex05_5 {

	public static void main(String[] args) {

			
		int [][] num = new int [3][]; //이차원 배열의 선언과 생성
		
		num[0] = new int [3];
		num[1] = new int [2];
		num[2] = new int [1];
		
		
		num[0][0] = 1; // 이차원배열 초기화 
		num[0][1] = 2;
		num[0][2] = 3;
		num[1][0] = 4;
		num[1][1] = 5;
		num[2][0] = 6;
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.println("num["+i+"]["+j+"] = " + num[i][j]);
			}
		}
	}

}
