
public class TestStudent {

	public static void changeAge(Student n) {
		n.setAge(40);
	}//end changeAge
	
	
	public static void main(String[] args) {

		Student stu = new Student("홍길동",20,"서울");
		System.out.println("변경전 나이:" +stu.getAge());
		changeAge(stu);
		System.out.println("변경후 나이:" +stu.getAge());

	}//end main
}//end class
