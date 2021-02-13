package school2;
public class StudentTest {
	public static void main(String[] args) {
		Student stusArr [] = new Student[3];
		stusArr[0] = new Student("홍길동", 15, 170, 80);
		stusArr[1] = new Student("한사람", 13, 180, 70);
		stusArr[2] = new Student("임걱정", 16, 175, 65);
		double totalAge = 0;
		double totalHeight = 0;
		double totalWeight = 0;
		int maxAgeIn = 0;
		int maxHeightIn = 0;
		int maxWeightIn = 0;
		for(int i = 0; i < stusArr.length; i++) {
			totalAge += stusArr[i].getAge();
			totalHeight += stusArr[i].getHeight();
			totalWeight += stusArr[i].getWeight();
			if( stusArr[maxAgeIn].getAge() <
					stusArr[i].getAge()) {
				maxAgeIn = i;
			}
			if( stusArr[maxHeightIn].getHeight() <
					stusArr[i].getHeight()) {
				maxHeightIn = i;
			}
			if( stusArr[maxWeightIn].getWeight() <
					stusArr[i].getWeight()) {
				maxWeightIn = i;
			}
		}
		System.out.println("나이가 제일 많은 학생이름 : " + stusArr[maxAgeIn].getName());
		System.out.println("신장이 가장 큰 학생이름 : " + stusArr[maxHeightIn].getName());
		System.out.println("몸무게가 제일 큰 학생이름 : " +stusArr[maxWeightIn].getName());
	}

}
