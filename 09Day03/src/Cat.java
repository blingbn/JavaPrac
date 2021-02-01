
public class Cat extends Pet {
	private String gender;
	
	public Cat() {
		super();
	}
	public Cat(String name, int age, String gender) {
		super(name,age);
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	
	

	@Override
	public void cry() {
		System.out.println("야옹!");
	}
	@Override
	public void eat() {
		System.out.println("생선먹기");
	}
	@Override
	public void sleep() {
		System.out.println("새근새근!");
	}
}
