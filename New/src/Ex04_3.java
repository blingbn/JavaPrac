import java.util.Scanner;

public class Ex04_3 {
	public static void main(String[] args) {
		/*
		int score = 88;
		char grade;
		
		if(score>=90){
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		
		System.out.println(grade);
		*/
		
		
		System.out.println("점수입력");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		char grade;
		if(score>=90){
			grade = 'A';
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		System.out.println(grade);
	}
}
