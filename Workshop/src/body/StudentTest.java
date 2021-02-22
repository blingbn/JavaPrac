package body;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] stus = new Student[3];
		stus[0]= new Student("홍길동", 15, 171, 81);
		stus[1]= new Student("한사람", 13, 183, 71);
		stus[2]= new Student("임걱정", 16, 175, 65);
		
		
		
		
		double totalAge = 0;
		double totalHeight = 0;
		double totalWeight = 0;
		
		int maxAgeIndex=0;
		int minAgeIndex=0;
		
		int maxHeightIndex=0;
		int minHeightIndex=0;
		
		int maxWeightIndex=0;
		int minWeightIndex=0;
		
		
		System.out.println("이름 \t 나이 \t 신장 \t 몸무게 ");
		
		for(int i = 0; i<stus.length; i++) {
			System.out.println(stus[i].studentInfo());
			totalAge+= stus[i].getAge();
			totalHeight+= stus[i].getHeight();
			totalWeight+= stus[i].getWeight();
			
			if(stus[maxAgeIndex].getAge()<stus[i].getAge()) {
				maxAgeIndex = i;
			}
			if(stus[minAgeIndex].getAge()>stus[i].getAge()) {
				minAgeIndex = i;
			}
			if(stus[maxHeightIndex].getHeight()<stus[i].getHeight()) {
				maxHeightIndex = i;
			}
			if(stus[minHeightIndex].getHeight()>stus[i].getHeight()) {
				minHeightIndex = i;
			}
			if(stus[maxWeightIndex].getWeight()<stus[i].getWeight()) {
				maxWeightIndex = i;
			}
			if(stus[minWeightIndex].getWeight()>stus[i].getWeight()) {
				minWeightIndex = i;
			}
		}
		System.out.println();
		System.out.printf("나이 평균 : %.3f \n", (totalAge / stus.length));
		System.out.printf("신장 평균 : %.3f \n", (totalHeight / stus.length));
		System.out.printf("몸무게 평균 : %.3f \n", (totalWeight / stus.length));
		System.out.println();
		System.out.println("나이가 가장 많은 학생 : " + stus[maxAgeIndex].getName());
		System.out.println("나이가 가장 적은 학생 : " + stus[minAgeIndex].getName());
		System.out.println("신장이 가장 큰 학생 : " + stus[maxHeightIndex].getName());
		System.out.println("신장이 가장 작은 학생 : " + stus[minHeightIndex].getName());
		System.out.println("몸무게가 가장 많이 나가는 학생 : " +
				stus[maxWeightIndex].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생 : " +
				stus[minWeightIndex].getName());

	}

}
