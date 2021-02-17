import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		
		//HashSetEx
		
		Set<String> s = new HashSet<String>();
		
		s.add("홍길동");
		s.add("이순신");
		s.add("유관순");
		s.add("홍길동");
		s.add("홍길동");
		
		System.out.println("toString() 전체출력" + s);
		for(String data : s) {
			System.out.println("forEach 전체출력 : " + data);
		}
		System.out.println("Set의 데이터 개수는? : "+s.size());
		System.out.println("Set이 비어있는가? : "+s.isEmpty());
		System.out.println("Set에 이순신이 있는가? : "+s.contains("이순신"));
		System.out.println("이순신 삭제 실행");
		s.remove("이순신");
		for(String data : s) {
			System.out.println("forEach : " + data);
		}
		
		Iterator<String> ite= s.iterator();
		while (ite.hasNext()) {
			String data = (String) ite.next();
			System.out.println("Iterator : " + data);
		}
		System.out.println("전체 삭제 실행");
		s.clear();
		System.out.println("toString() 전체출력 : " + s );
		
	}

}
