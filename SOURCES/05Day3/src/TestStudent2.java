
public class TestStudent2 {

	public static void main(String[] args) {
	
		
		//1. student 객체생성
		Student stu1 = new Student(); //객체선언 및 생성, 멤버변수는 초기값
		
		//2. 1번학생 자료 저장
		stu1.name = "홍길동";
		stu1.age = 20;
		
		//3. 2번학생 자료저장
		Student stu2 = new Student(); 
		stu2.name = "강감찬";
		stu2.age = 30;
		
		
		//4. 객체의 사용
		System.out.println(stu1+"\t"+stu2);
		System.out.println(stu1.name+"\t"+stu2.name);
		System.out.println(stu1.age+"\t"+stu2.age);
		
		
		
		
		
		
		
	}

}
