
public class Pet { //부모클래스
	private String name;
	private int age;
	
	
	//기본생성자
	
	public Pet() {	}

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
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
}
