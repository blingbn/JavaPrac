package prac;

public class Prac1 {
	
	public static void main(String[] args) {
		
		//이름이 홍길동이고 나이가 20인사람의 객체를 생성하고, 이름을 이순신, 나이를 40으로 바꾸시오.
		
		Person p = new Person("홍길동", 20);
		p.setName("이순신");
		p.setAge(40);
		
		String name = p.getName();
		int age = p.getAge();
		
		System.out.println(name+age);
		
		
		
	}

}
