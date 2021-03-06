
public class TestMain {
	int num; //객체생성 후 사용하는 멤버변수, 클래스 전체에서 사용
	
	

	public int getNum() {
		return num;
	}





	public void setNum(int num) {
		this.num = num;
	}

	
	
	
	
	public static void main(String[] args) {//컴파일시 클래스 로딩->static변수, 함수로딩
		
		TestMain t = new TestMain(); //객체생성
		System.out.println(t.num); //객체생성 후 사용
		t.setNum(100);
		System.out.println(t.getNum());
	}

	
}

