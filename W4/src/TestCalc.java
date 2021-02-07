
public class TestCalc {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		if(num>=5 && num<=10) {
			Calc calc = new Calc();
			System.out.println("결과 : " +calc.calculate(num));
		}else {
			System.out.println("다시입력하세요.");
		}
		

	}

}
