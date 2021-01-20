
public class Sample03_typeCasting2 {

	public static void main(String[] args) {
		
		
		
		//데이터 타입 변경 (명시적으로 형 변환)
		int n = 10;
		short n2 = (short)n;
		System.out.println(n2);
		
		
		short x = 10;
		short x2 = 20;
		short x3 = (short)(x + x2); //주의 명시적 형 변환 필요
		//short x4 = (short) x + x2; //불가

	}

}
