
public class TestStudent {

	
	//추가기능 ==> 메서드
	// "홍길동"==> "홍"
	
	public static void main(String[] args) {
		Student stu1 = new Student("홍길동", 20, "서울");
		System.out.println(stu1.toString());
		StudentUtil util = new StudentUtil();
		System.out.println("성은 ======="+util.firstName(stu1) );
		System.out.println("길이는  ======="+util.nameLength(stu1) );
		System.out.println("길이는  ======="+util.nameLength2(stu1) );
		

	}//end main
}//end class
