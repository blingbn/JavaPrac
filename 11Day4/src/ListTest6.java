import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(9);
		set.add(6);
		set.add(1);
		set.add(3);
		set.add(4);

		System.out.println("정렬 전 : " + set);
		Collections.sort(set);
		System.out.println("정렬 후 : " + set);
		
		System.out.println("정렬 전 : " + set);
		Collections.reverse(set);	
		System.out.println("정렬 후 : " + set);
		
		
		List<Person> list = new ArrayList<Person>();
		
		list.add(new Person("홍길동",20,"서울"));
		list.add(new Person("이순신",44,"경기"));
		list.add(new Person("유관순",18,"제주"));
		list.add(new Person("강감찬",66,"부산"));
		
		//age로 정렬
		Collections.sort(list, new PersonAgeSortComparator());
		for(Person s : list) {
			System.out.println(s);
		}
		
		
	}

}
