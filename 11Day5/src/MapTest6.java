import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest6 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("홍길동", 20, "서울"));
		list.add(new Person("홍길동2", 30, "서울2"));
		list.add(new Person("홍길동3", 40, "서울3"));
		
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("이순신", 20, "전라"));
		list2.add(new Person("이순신2", 30, "전라2"));
		list2.add(new Person("이순신3", 40, "전라3"));
		
		HashMap<String, ArrayList<Person>> map = new HashMap<String, ArrayList<Person>>();
		
		map.put("one", list);
		map.put("two", list2);
		/*
		ArrayList<Person> listOne = map.get("one");
		
		Iterator<Person> pit = listOne.iterator();
		while (pit.hasNext()) {
			Person p = (Person) pit.next();
			System.out.println(p.getName());
		}
		
		*/
		
		
		
		/*
		//데이터출력하기
		Set<String> keys = map.keySet();
		for(String key : keys) {
			ArrayList<Person> xxx = map.get(key);//각 key에 list출력
			for(Person p : xxx) { // 각 value 출력
				System.out.println(p.getName()+ " " + p.getAge());
			}
		}
		*/
		Set<String> keys = map.keySet();
		Iterator<String> ks = keys.iterator();
		while (ks.hasNext()) {
			String string = (String) ks.next();
			ArrayList<Person> p1 = map.get(string);
			Iterator<Person> pie = p1.iterator();
			while (pie.hasNext()) {
				Person person = (Person) pie.next();
				System.out.println(person.getName()+" "+person.getAge());
			}
		}
		/*
		Set<String> keys2 =map.keySet();
		Iterator<String> it = keys2.iterator();
		while (it.hasNext()) {
			String key = (String) it.next(); // 키를 하나 꺼내온것
			Person p1 = map.get(key);
			System.out.println(key + p1.getName());
		}
		*/
		
	}

}