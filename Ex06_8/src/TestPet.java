
public class TestPet {

	public static void main(String[] args) {
		
		
		Pet[] pets = {
					new Cat("나비", 2, "암컷", "흰색"),
					new Cat("하늘", 5, "수컷", "회색"),
					new Dog("멍멍", 3, "수컷", "리트리버"),
					new Cat("야옹이", 20, "수컷", "블랙"),
					new Dog("망치", 1, "수컷", "불독"),
		};
		
		/*
		for(Pet pet : pets) {
			System.out.println(pet.getPet());
		}
		*/
		/*
		//Cat만 출력하고싶다면
		for(Pet pet : pets) {
			if(pet instanceof Cat) {
				Cat c = (Cat)pet;
				System.out.println("고양이 " + c.getPet());
			}
		}
		*/
		for(Pet pet : pets) {
			if(pet instanceof Dog) {
				Dog d = (Dog)pet;
				System.out.println("멍멍이 "+ d.getPet());
			}
		}
		
	}

}
