
public abstract class Pet { //부모클래스
	private String name;
	private int age;
	
	public abstract void cry();
	public abstract void eat();
	public abstract void sleep();
	
	public Pet() {
		super();	
	}
	
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
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
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	
}
