import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMybaisMain4 {

	public static void main(String[] args) {
	
		OracleMyBatisService service =new OracleMyBatisService();
	
		//검색
		int deptno =10;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("deptno", null);
		
		List<Dept> list = service.selectDynamicDeptno(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}//end main
}//end class






