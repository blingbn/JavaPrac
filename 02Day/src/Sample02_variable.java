
public class Sample02_variable {

	public static void main(String[] args) {
		
		//홍길동 20 서울 성별(남) 결혼여부(false) 키(185.63) 체중(78.25)
		//1. 변수선언(메모리에 특정크기의 영역생성)
		
		String name;
		int age;
		String address;
		char gender;
		boolean isMarried;
		float height;
		double weight;
				
		//2. 변수에 값 초기화(값을 맨처음 설정하는 작업) -사용은 반드시 초기화 후에 함
		name = "홍길동";
		age = 20;
		address = "서울";
		gender = '남';
		isMarried = false;
		height = 185.63f;
		weight = 78.25;
		
		//3. 사용 - 출력
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);

		
		

	}

}
