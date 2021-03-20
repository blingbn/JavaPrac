
public class TestStudent {

	public static void main(String[] args) {
	//1. 객체생성
		Student stu1= new Student("홍길동", 10, "서울");//명시적 생성자 호출
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
		Student stu2= new Student();
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);

	}

}
