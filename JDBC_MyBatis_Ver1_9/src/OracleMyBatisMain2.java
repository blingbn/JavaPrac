import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain2 {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		List<Integer> deptnoes = Arrays.asList(13,30,40);
		
		List<Dept> list = service.multiSelect(deptnoes);
		System.out.println(list);
		
		
		//deptno 검사해서 있는 경우 동적으로 sql where조건절 추가
		
	}

}
