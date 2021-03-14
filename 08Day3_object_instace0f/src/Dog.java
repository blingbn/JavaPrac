
public class Dog extends Pet{

	private String gender;
	private String color; //다른 애완동물에 없는 속성 가정...
	
	//동작
	
	//다른 애완동물에 없는 기능 가정... 
	public void run() {
		System.out.println("발발~");
	}
	
	public Dog(String name, int age, String gender, String color) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.color = color;
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

	@Override
	public String toString() {
		return "Dog [gender=" + gender + ", color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
