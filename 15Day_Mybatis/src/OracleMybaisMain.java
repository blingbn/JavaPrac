import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMybaisMain {

	public static void main(String[] args) {
	
		OracleMyBatisService service =new OracleMyBatisService();
		//1. selectAll
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		
	}//end main
}//end class






