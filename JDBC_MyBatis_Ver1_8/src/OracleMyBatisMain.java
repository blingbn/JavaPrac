import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		//int deptno = 10; int 로 넘겨서도 가능
		HashMap<String, String> map = new HashMap<String, String>();
		map.put(null, null);
		//map.put("dname", "개발");
		//map.put("loc", "서울");
		
		List<Dept> list = service.selectDynamicChoose(map); //동적SQL 사용
		System.out.println(list);
		
		//deptno 검사해서 있는 경우 동적으로 sql where조건절 추가
		
	}

}
