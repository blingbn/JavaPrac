package workshop07.mobile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<String, Mobile> map = new HashMap<String, Mobile>();
		double sum=0.0;
		
		map.put("LU6800", new Mobile("LU6800","Optimus 2X", 800000));
		map.put("SU6600", new Mobile("SU6600","Optimus Black", 900000));
		map.put("KU5700", new Mobile("KU5700","Optimus Big", 700000));
		map.put("SU7600", new Mobile("SU7600","Optimus Mach", 950000));
		
		Set<String> keys = map.keySet();
		for(String x : keys) {
			Mobile m = map.get(x);
			System.out.println(m.getCode()+" "+m.getName()+" "+m.getPrice());
			sum+=m.getPrice();
		}
		
		System.out.println("합계 : "+ sum );
		System.out.println();
		System.out.println();
		
		
		System.out.println("가격 변경 후");
		for(String x : keys) {
			Mobile m = map.get(x);
			double price = m.getPrice()+(m.getPrice()*0.1);
			System.out.println(m.getCode()+" "+m.getName()+" "+price);
			
		}
		
		System.out.println("합계 : "+ sum );
	}

}
