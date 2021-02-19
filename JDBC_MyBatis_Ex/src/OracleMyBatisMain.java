import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		//int deptno = 10; int 로 넘겨서도 가능
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("deptno", 10);
		Dept dept = service.selectByDeptno(map);
		System.out.println(dept);
		
	}

}
