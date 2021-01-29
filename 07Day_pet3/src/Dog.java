
public class Dog extends Pet {
	private String gender;
	private String color;

	
	public Dog(String name, int age, String gender, String color) {
		super(name,age);
		this.gender = gender;
		this.color = color;
	}
	// 동작
	/*
		public void cry() {
			System.out.println("멍멍~");
		}
		public void eat() {
			System.out.println("사료 먹기");
		}
		public void sleep() {
			System.out.println("쿨쿨~");
		}
		*/
		public void runDog() {
			System.out.println("발발~");
		}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}