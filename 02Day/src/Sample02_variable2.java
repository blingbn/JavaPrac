
public class Sample02_variable2 {

	public static void main(String[] args) {
		
		//선언과 동시에 변수명 지정
		
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		char gender = '남';
		boolean isMarried = false;
		float height = 185.63f;
		double weight = 78.25;
		
		//2. 사용 출력
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);
		
		//3. printf + println 사용
		
		System.out.printf("이름은 %s, 나이는 %d, 주소는 %s 입니다.", name,age,address);
		System.out.println();
		
		System.out.println("이름은 " + name + ", 나이는 " + age +", 주소는 " + address + " 입니다.");
		
		//4. println으로 모든 값 - > "문자열 + 변수명 == 문자열 생성 
		System.out.println("이름은 " + name + ", 나이는 " + age +", 주소는 " + address + ", 성별은 " + gender + ", 결혼은 " + isMarried +
				", 키는 " + height + ", 몸무게는 " + weight + " 입니다.");
		
		
		
		//홍길동 20 서울 성별(남) 결혼여부(false) 키(185.63) 체중(78.25) 이대로 출력되도록
		System.out.println(name + ' ' + age + ' ' + address + " 성별(" + gender + ") 결혼여부(" + isMarried + 
				") 키(" + height + ") 몸무게(" + weight + ')');
		
		

	}

}
