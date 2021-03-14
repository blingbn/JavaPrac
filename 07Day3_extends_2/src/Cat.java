
// Cat is a Pet ==> 상속관계로 지정가능

public class Cat extends Pet{


	private String gender;
	
	//동작
	public void cry() {
		System.out.println("야옹이~");
	}
	public void sleep() {
		System.out.println("새근새근");
	}
	public void eat() {
		System.out.println("생선먹기");
	}
	
	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
