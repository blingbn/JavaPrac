
public class TestStudent {

	public static void main(String[] args) {


//		Student stu = new Student("홍길동1","서울1");
//		Student stu2 = new Student("홍길동2","서울3");
//		Student stu4 = new Student("홍길동4","서울4");
//		Student stu5 = new Student("홍길동5","서울5");
//		Student stu6 = new Student("홍길동5",19,"서울5");
//
//		// 데이터타입 [] 배열명 = { 값1,값2};
//		Student [] yy = {stu,stu2,stu4,stu5,stu6 };
		
		Student [] yy2 = {new Student("홍길동1","서울1"),
				new Student("홍길동2","서울3"),
				new Student("홍길동4","서울4"),
				new Student("홍길동5","서울5"),
				new Student("홍길동5",19,"서울5") };
		for(Student x: yy2) {
			System.out.println(x.getName());
		}

	}

}
