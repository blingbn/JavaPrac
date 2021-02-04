import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>(); //다형성
		map.put("one", "홍길동");
		map.put("two", "이순신");
		map.put("three", "유관순");
		map.put("one", "강감찬"); //덮어쓰기 key : one / value : 강감찬
		map.put("four", "강감찬"); //key만 중복이 안되면 됨
		map.put("one", null);
		map.put(null, null);

		
		
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		System.out.println(map.get("four"));
		System.out.println(map.get(null));
	}

}
