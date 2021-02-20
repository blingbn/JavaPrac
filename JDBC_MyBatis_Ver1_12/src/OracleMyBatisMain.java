import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
			/**/
		
		List<Dept> depts = Arrays.asList(new Dept(12,"aa", "bb"), new Dept(13,"bb", "aa"));
		service.multiInsert(depts);
		
		List<Dept> list = service.selectAll();
		for(Dept dept : list) {
			System.out.println(dept);
		}
		
	
		 
		//List<Integer> deptnoes = Arrays.asList(13,30,40);
		//List<Dept> list = service.multiSelect(deptnoes);
		//System.out.println(list.get(0));
		//List<Dept> list = service.multiSelect(deptnoes);
		//System.out.println(list);
		
		
		
	}

}
