
public class Cat extends Pet {

	
	private String gender;

	

	public Cat(String name, int age, String gender) {
		super(name, age); //Pet의 기본생성자를 호출
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	// 동작
		public void cry() {//부모의 함수이름과 동일하게 수정
			System.out.println("야옹이~");
		}
		public void eat() {
			System.out.println("생선먹기~");
		}
		public void sleep() {
			System.out.println("새근새근~");
		}
	
	/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	*/
	

}
