import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args)  {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		
		
		List<Dept> deptList4 = service.selectTopN("제주", 0,2);//검색어, 시작위치, 개수
		for(Dept dept : deptList4) {
			System.out.println(">>>" + dept);
		}
		
		
		
		
		
		
		
		
		/*
		//5. Top-N 분석 => 페이징처리
		List<Dept> deptList3 = service.selectTopN(0,3); //시작 idx, 꺼내올 개수
		for(Dept dept : deptList3) {
			System.out.println(">>>"+dept);
		}
		System.out.println();
		// sysdate 불러오기
		String date=service.getDate();
		System.out.println("sysdate불러오기 : " + date);
		*/
		
		
		
		/*
		List<Dept> depts = Arrays.asList(new Dept(12,"aa", "bb"), new Dept(13,"bb", "aa"));
		service.multiInsert(depts);
		
		List<Dept> list = service.selectAll();
		for(Dept dept : list) {
			System.out.println(dept);
		}
		*/
	
		 
		//List<Integer> deptnoes = Arrays.asList(13,30,40);
		//List<Dept> list = service.multiSelect(deptnoes);
		//System.out.println(list.get(0));
		//List<Dept> list = service.multiSelect(deptnoes);
		//System.out.println(list);
		
		
		
	}

}
