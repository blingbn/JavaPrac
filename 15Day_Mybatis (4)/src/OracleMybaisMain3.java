import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMybaisMain3 {

	public static void main(String[] args) {
	
		OracleMyBatisService service =new OracleMyBatisService();
	
		// dept 레코드갯수
		int num = service.deptRecordCount();
		System.out.println("레코드 갯수:"  +num);
		
	}//end main
}//end class






