
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.사용할 클래스 객체 생성
		Person p1= new Person("홍길동", 10, "서울");
		System.out.println(p1.name+"\t"+p1.age+"\t"+p1.addr);
		Person p2= new Person("이순신", 20, "경기");
		System.out.println(p2.name+"\t"+p2.age+"\t"+p2.addr);
		p2=new Person();//기본생성자 호출 
		System.out.println(p2.name+"\t"+p2.age+"\t"+p2.addr);
		System.out.println(p2);
	}

}
