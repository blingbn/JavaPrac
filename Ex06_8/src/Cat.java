
public class Cat extends Pet {
	String color;

	public Cat(String name, int age, String gender, String color) {
		super(name, age, gender);
		this.color = color;
	}

	@Override
	public String getPet() {
		// TODO Auto-generated method stub
		return super.getPet() + "\t" + color;
	}
	
	
	
}
