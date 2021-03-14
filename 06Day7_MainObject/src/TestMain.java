
public class TestMain {
	int num;//객체생성 후 사용하는  멤버변수 , 클래스 전체에서 사용 	
	public int getNum() {  //멤버메소드(함수)
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}




	public static void main(String[] args) {//클래스 로딩 -> static 변수, 함수 로딩 
		// TODO Auto-generated method stub
		TestMain t= new TestMain();//객체생성		
		System.out.println(t.num);//객체생성 후 사용 
		t.setNum(100);
		System.out.println(t.getNum());

	}

}
