
class MyMath{
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	long subtract(long a, long b) {return a-b;}
	long multiply(long a, long b) {return a*b;}
	double divide(double a, double b) {return a/b;}
}



public class Method {

	public static void main(String[] args) {
		
		MyMath mm = new MyMath();
		long value = mm.add(1L, 2L);//add메소드 호
		System.out.println(value);
		
	
		double value1 = mm.divide(5L, 3L);
		System.out.println(value1);
		

	}

}
