import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {

	public static void main(String[] args) {
		
		
		
		Set<Person> set = new HashSet<Person>();
		Person kkkk = new Person("유관순", 17, "서울");
		set.add(kkkk);
		set.add(new Person("홍길동", 20, "서울"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(new Person("이순신", 44, "전라")); //new로 주소가 다르므로 중복이 x 
		
		System.out.println(set);
		
		
		for(Person x : set) {
			System.out.println(x.getName());
		}
		
		Iterator<Person> ite = set.iterator();
		while (ite.hasNext()) {
			Person person = (Person) ite.next();
			System.out.println(person);
		}
	}

}
