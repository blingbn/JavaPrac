import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest7 {

	public static void main(String[] args) {
		HashMap<String,Person> map1 = new HashMap<>();
		map1.put("one",new Person("홍길동", 20, "서울"));
		map1.put("two",new Person("홍길동2", 30, "서울2"));
		map1.put("three",new Person("홍길동3", 40, "서울3"));
		
		HashMap<String,Person> map2 = new HashMap<>();
		map2.put("one",new Person("이순신", 20, "전라"));
		map2.put("two", new Person("이순신2", 30, "전라2"));
		map2.put("three", new Person("이순신3", 40, "전라3"));
		
		ArrayList<HashMap<String,Person>> list = new ArrayList<HashMap<String,Person>>();
		list.add(map1);
		list.add(map2);
		
		
		//홍길동 1번 출력
//		HashMap<String, Person> mp1 = list.get(0);
//		Person p = mp1.get("one");
//		System.out.println(p.getName());

		for(HashMap<String, Person> x : list) {// map하나 꺼내기
			//map이용 순회 
			Set<String>keys = x.keySet();
			for(String key : keys) {//키 하나 꺼내기
				Person p = x.get(key);//Person 하나 꺼내기
				System.out.println(p.getName());
			}
		}
		
		//2. Iterator이용
		
		System.out.println("===============================");
		Iterator<HashMap<String,Person>> it = list.iterator();
		while (it.hasNext()) {
			HashMap<java.lang.String, Person> map = (HashMap<java.lang.String, Person>) it.next();
			Set<String> keys = map.keySet();
			Iterator<String> mit = keys.iterator();
			while (mit.hasNext()) {
				String key = (String) mit.next();
				Person p = map.get(key);
				System.out.println(p.getName()+" "+p.getAge());
			}
		}
	}

}
