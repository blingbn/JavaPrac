
public class Pet {

	String name;
	int age;
	//String xxx="Pet";

	public void cry() {
		System.out.println("멍멍~");
	}
	public void eat() {
		System.out.println("사료 먹기");
	}
	public void sleep() {
		System.out.println("쿨쿨~");
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
