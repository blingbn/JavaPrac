
public class MultiArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[2][3];
		
		
		//초기화
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;
		
		num[1][0] = 40;
		num[1][1] = 50;
		num[1][2] = 60;
		
		/*
		for(int i = 0; i<num.length; i++){//앞 행의 개수 0-1
			for(int j =0; j<num[i].length; j++) { //뒷열의 개수 0-2
				System.out.println("num["+i+"]["+j+"]="+num[i][j]);
			}
		}System.out.println("============");
		*/
		
		System.out.println(num[0]);
		
		
		
		
		
		
		
	}

}
