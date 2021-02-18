import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		
		
		Dept dept1 = service.selectByDeptno(10);
		System.out.println(dept1);
		
		
		
		/*
		List<Dept> list = service.selectAll();
		for(Dept dept : list) {
			System.out.println(dept);
		}
		*/
		//service.insert(new Dept(99,"개발", "강남"));

		//service.update(new Dept(99,"영업","서울"));
		
		//int num = service.delete(99);
		//System.out.println(num);
	}

}
