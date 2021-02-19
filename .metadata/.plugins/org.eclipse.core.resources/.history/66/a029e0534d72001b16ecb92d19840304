import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("deptno", 10);
		Dept dept = service.selectByDeptno(map);
		System.out.println(dept);
		
	}

}
