import java.util.Scanner;

import com.model.Student;
import com.util.ArrUtil;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrUtil util = new ArrUtil();
		
		Student[] stuarr = util.createArr(); //배열을 받아옴
		
		//changeName : 학생전체이름 => 홍길동 -> 홍길동학생 나머지도 마찬가지로
		//changeName(학생배열) 학생배열 리턴 
		//getNames사용해서 학생 전체의 이름을 출력 
		//arrPrint 사용해서 학생전체의 이름을 출력 
		
		stuarr = util.changeName(stuarr);
		util.ArrPrint(stuarr);
		
		
		
		
		
		
		/*
		//searchByName(배열, 이름) -> 이름에 해당하는 학생을 받음.
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		Student stu = util.searchByName(stuarr, name);
		if(stu == null) {
			System.out.println("이름이 없습니다.");
		}else {
			util.stuAPrint(stu);
		}
		scan.close();
		
		//util.stuAPrint(stu);
				
		*/
		
		
		
		
		//나이가 제일 많은 학생을 검색해서 반환하는 함수
		//maxAge(배열) -> 나이를 비교, 제일 나이가 많은 객체 반환
		Student max = util.maxAge(stuarr);
		util.stuAPrint(max);
		
		
		
		//학생한명의 데이터를 전체 출력 print() 함수 호출
		Student stu1 = stuarr[0]; //홍길동 객체 
		
		util.stuAPrint(stu1);
		
		
		
		
		
		//배열에서 학생이름만 "홍길동 / 강감찬 / 유관순"; = > 메인에서 출력
		//String names = util.getNames(stuarr);
		//System.out.println("main에서 데이터 출력시 : " + names);
		
		

		
	}

}
