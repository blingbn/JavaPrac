
public class TestPet6 {

	public static void main(String[] args) {
	
		// 다형성 대표적인 예
		//1. 배열
		Pet [] c = { 
				     new Cat("야옹이", 3, "암놈"),
				     new Cat("야옹이", 3, "암놈"),
		             new Dog("누렁이", 8, "암놈", "검정"),
		             };
		for( Pet  x:c) {
			String name = x.getName();
			int age = x.getAge();
			//형변환
		  if(x instanceof Cat) {	
			 Cat xx = (Cat)x;
			 String gender = xx.getGender();
			 System.out.println(name+"\t"+age+"\t"+gender);
		  }else if(x instanceof Dog) {
			  Dog yy =(Dog)x;
			  String gender = yy.getGender();
			  String color =yy.getColor();
System.out.println(name+"\t"+age+"\t"+gender+"\t"+color);
		  }
		}//end for

		
		
	}//end main

}
