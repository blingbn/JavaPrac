
public class TestStudent {

	
	//추가기능 ==> 메서드
	// "홍길동"==> "홍"
	
	public static void main(String[] args) {

		Student stu = new Student("홍길동",20,"서울");
		StudentUtil util = new StudentUtil();
		String name =stu.getName(); //홍길동
		System.out.println(util.firstName(name)//홍
				+"\t"+util.nameLength(name));//3
		
		Student stu2 = new Student("박혁거세",40,"경기");
		String name2 =stu2.getName();
		System.out.println(util.firstName(stu2.getName())//name2도 가능
				+"\t"+util.nameLength(name2));
		
		

	}//end main
}//end class
