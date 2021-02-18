import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain2 {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		int num = service.deptRecordCount(); //레코드 갯수 리턴
		//Mapper2.xml : id : deptRecordCount
		System.out.println("레코드 개수는 num ==== "+num);
		
		
		List<Dept> list = service.selectAll();
		System.out.println("list 사이즈 : "+list.size());
		System.out.println(num==list.size());
		for(Dept dept : list) {
			System.out.println(dept);
		}	
		

	
	}

}
