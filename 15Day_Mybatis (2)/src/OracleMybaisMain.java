import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMybaisMain {

	public static void main(String[] args) {
	
		OracleMyBatisService service =new OracleMyBatisService();
		
		//2. insert
		service.insert(new Dept(77,"개발","서울"));
		
		
		//1. selectAll
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		
	}//end main
}//end class






