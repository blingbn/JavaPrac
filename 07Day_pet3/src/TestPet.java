
public class TestPet {

	public static void main(String[] args) {
		
		
		//고양이2마리, 강아지 1마리, 물고기1마리
		Cat c = new Cat("야옹이", 3, "암놈");
		Cat c2 = new Cat("하늘이", 1, "숫놈");
		Dog d = new Dog("누렁이", 8,"암놈", "검정");
		Fish f = new Fish("골드", 1, 163.3);
		
		
		/*
		System.out.println(c.getName()+ " " +c.getAge() + " " + c.getGender());//야옹이
		c.eat();
		c.cry();
		c.sleep();
		*/
		
		/*
		System.out.println(c2.getName()+ " " +c2.getAge() + " " + c2.getGender());//야옹이
		c.eatCat();
		c.cryCat();
		c.sleepCat();
		*/
		
		
		System.out.println(d.getName()+ " " +d.getAge() + " " + d.getGender()+" "+d.getColor());//야옹이
		d.eat();
		d.cry();
		d.sleep();
		d.getColor();
		
		System.out.println(f.getName()+ " " +f.getAge() + " " + f.getTallSize());//야옹이
		f.swimFish();
		
	}

}
