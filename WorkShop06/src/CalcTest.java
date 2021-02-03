
public class CalcTest {

	public static void main(String[] args) {

		
		int data1 = Integer.parseInt(args[0]);
		String arg = args[1];
		char operator = arg.charAt(0); //charAt(indexN);
		int data2 = Integer.parseInt(args[2]);
		
		Calculator calc = new Calculator();
		
		if (operator == '+') {
			System.out.println(calc.plus(data1, data2));
		}else if(operator == '-') {
			System.out.println(calc.minus(data1, data2));
		}else if(operator == 'x') {
			System.out.println(calc.multiply(data1, data2));
		}else {
			System.out.println(calc.divide(data1, data2));
		}
	}

}
