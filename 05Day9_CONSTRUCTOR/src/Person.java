
public class Person {
	//1. 멤버변수 영역 
	String name;
	int age;
	String addr;
	//2. 생성자 명시적 작성
	public String toString() {
		return this.name+"\t"+this.age+"\t"+this.addr;
	}
	public Person(String name, int age, String addr) {
		System.out.println("Person(String name, int age, String addr)  호출");
		//멤버변수에 값 설정
		this.name=name;  //객체의 변수(멤버변수)
		this.age=age;
		this.addr=addr;
	}
	//3. 기본생성자 명시적 작성 반드시 할 것
	public Person() {
		System.out.println("기본생성자 호출됨");
	}
}
