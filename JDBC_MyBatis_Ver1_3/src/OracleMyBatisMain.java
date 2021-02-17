import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) {
		
		
		
		
		
		OracleMyBatisService service = new OracleMyBatisService();
		//service.insert(new Dept(99,"개발", "강남"));
		//System.out.println("insert 개수 =======" + num);
		
		Dept dept = service.selectByDeptno(99);
		System.out.println(dept);
		
//		List<Dept> list = service.selectAll(); 
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
//		
//		
		
	}

}
