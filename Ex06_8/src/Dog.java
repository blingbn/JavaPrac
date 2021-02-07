
public class Dog extends Pet {

	String species;

	public Dog(String name, int age, String gender, String species) {
		super(name, age, gender);
		this.species = species;
	}

	@Override
	public String getPet() {
		// TODO Auto-generated method stub
		return super.getPet() + "\t" + species;
	}
	
	
	
	
}
