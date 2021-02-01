abstract class MyClass{
	int num = 3;
	public MyClass() {}
	public MyClass(int num) {
		super();
		this.num = num;
	}
	public void methodA() {
		System.out.println("methodA=======");
	}
	public abstract void methodB();	
}// ends MyClass

class MyClassImp1 extends MyClass{
	public void print() {
		System.out.println(num);
	}
	@Override
	public void methodB() {
		System.out.println("methodB=======");
	}
}//ends MyClassImp1

public class Ex07_1 {

	public static void main(String[] args) {
		MyClassImp1 imp = new MyClassImp1();//다형성 적용
		imp.print();
		imp.methodB();		//다형성 적용 오버라이딩 된 함수 호출 
	}
}
