
public class TestMain {
	public static void main(String[] args) {
		
		System.out.println(Person.age);//0
		Person.b();//0
		//System.out.println(p.name); //static도 아니고 객체생성전이라 사용불가
		Person p= new Person();
		System.out.println(p.name); //null
		System.out.println(p.age); //0 static은 클래스변수로 객체 생성이전이나 이후에도 사용 가능
		p.a();//null, 0
		System.out.println(Person.age); //0
		Person.b();//0
		
		p.age=20;
		Person p2= new Person();
		System.out.println(p2.age);//20
		
		
	}//end main
}//end class
