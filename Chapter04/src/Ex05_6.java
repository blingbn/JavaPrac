
public class Ex05_6 {

	public static void main(String[] args) {
		
		
		int[][] num = {{1,2}, {3,4}, {5,6,7}}; // 총 3개배열 2,2,3열 선언과 초기화
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.println("num["+ i +"]["+j+"]="+num[i][j]);
			}
		}
		
		
		String[][]name = {{"홍길동", "이순신"}, {"유관순"}}; //2행 2,1열 선언과 초기화
		for(int i=0; i<name.length; i++) {
			for(int j=0; j<name[i].length; j++) {
				System.out.println("name["+ i +"]["+j+"]="+name[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
