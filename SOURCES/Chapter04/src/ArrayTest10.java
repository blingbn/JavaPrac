
public class ArrayTest10 {

	public static void main(String[] args) {


		
		
		//2차원배열 
		//1. new
		//2. 값
		/*
		int [][] num = {{10,20,30}, {40}, {50,60}};
		for (int[] is : num) {
			for(int x : is) {
				System.out.println(x);
			}
		}
		*/
		
		//for문
		int [][] num = {{10,20,30}, {40}, {50,60}};
		for(int i = 0; i< num.length; i++) {
			for(int j = 0; j<num[i].length; j++) {
				System.out.println("["+i+"]["+ j+"]");
			}
		}
		
		
		
		
		
		
		
		
	}

}
