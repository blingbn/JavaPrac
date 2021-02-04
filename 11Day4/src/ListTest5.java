import java.util.ArrayList;
import java.util.Iterator;

public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<>();
		Person p1 = new Person("홍길동", 10, "서울");
		Person p2 = new Person("이순신", 20, "경기");		
		Person p3 = new Person("유관순", 30, "제주");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println(list.get(0)); // 홍길동 
		
		//1. for each문
		for(Person p : list) {
			System.out.print(p.getName()+" ");
		}
		System.out.println();
		System.out.println("==============");
		//2. for문
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i).getName());
		}
		System.out.println();
		//3. iterator이용 이름찍기
		Iterator<Person> li = list.iterator();
		while (li.hasNext()) {
			Person p = (Person) li.next();
			System.out.println(p.getName());
		}
	}
	

}
