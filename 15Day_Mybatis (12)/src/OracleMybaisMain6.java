import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMybaisMain6 {

	public static void main(String[] args) {
	
		OracleMyBatisService service =new OracleMyBatisService();
	
		//4. multi insert
		List<Dept> deptList =
Arrays.asList(new Dept(1, "개발", "서울"),
		      new Dept(2, "영업", "부산"),new Dept(3, "관리", "제주") );
		service.multiInsert(deptList);
	
		
		
	}//end main
}//end class






