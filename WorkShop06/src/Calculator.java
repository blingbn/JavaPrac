
public class Calculator {

	
	public double plus(int data1, int data2) {
		double result = 0.0;
		result = data1 + data2;  
		return result;
	}
	public double minus(int data1, int data2) {
		double result = 0.0;
		result = data1 - data2;  
		return result;
	}
	public double multiply(int data1, int data2) {
		double result = 0.0;
		result = data1 * data2;  
		return result;
	}
	public double divide(int data1, int data2) {
		double result = 0.0;
		try {
			result = data1 / data2;
		} catch (ArithmeticException e) {
			System.out.println("Exception이 발생하였습니다. 다시 입력해주세요.");
		} 
		return result;
	}
	
	
	
	
}
