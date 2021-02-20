import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain2 {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("key1", 10);
		map.put("key2", 13);
		
		//select할 값을 hashmap으로 전달
		List<Dept> list = service.selectByHashMap(map);
		for(int i=0; i<list.size(); i++) {
			System.out.println(list);
		}
		
		
		/*
		Set Keys = map.keySet();//전체키 deptno, dname, loc
		/*
		for (Object key : Keys) {
			System.out.print(key+ " ");
			System.out.println(map.get(key));
		}
		
		Iterator ite= Keys.iterator();
		while (ite.hasNext()) {
			Object key = ite.next();
			System.out.print(key+" ");
			System.out.println(map.get(key));
		}
		
		*/
	
	}

}
