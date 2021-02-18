import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.service.OracleMyBatisService;

public class OracleMyBatisMain2 {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		HashMap map = service.selectByDeptnoHashMap(10);
		//System.out.println(map);
		
		Set Keys = map.keySet();//전체키 deptno, dname, loc
		/*
		for (Object key : Keys) {
			System.out.print(key+ " ");
			System.out.println(map.get(key));
		}
		*/
		Iterator ite= Keys.iterator();
		while (ite.hasNext()) {
			Object key = ite.next();
			System.out.print(key+" ");
			System.out.println(map.get(key));
		}
	
	
	}

}
