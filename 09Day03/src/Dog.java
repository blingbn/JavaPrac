
public class Dog extends Pet {
	private String color;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String name, int age, String color) {
		super(name,age);
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [color=" + color+", getName() = " + getName() +", getAge()=" +getAge()+ "]";
	}
	@Override
	public void cry() {
		System.out.println("멍멍~");
	}
	@Override
	public void eat() {
		System.out.println("쩝쩝~");
	}
	@Override
	public void sleep() {
		System.out.println("쿨쿨~");
	}
}