import java.util.List;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleMyBatisService;

public class OracleMyBatisMain {

	public static void main(String[] args) /* 4. throws RecordNotFoundException 시스템오류처럼 나와서 깔끔하게 처리ㄴ */ {
		
		OracleMyBatisService service = new OracleMyBatisService();
		
		//insert
		
		/*
		int num= service.insert(new Dept(99,"개발","강남"));
		System.out.println("insert 개수 =======" + num);
		Dept dept = service.selectByDeptno(99);
		System.out.println(dept);
		*/
		
		//update
		/*
		int num = service.update(new Dept(99,"영업","서울"));
		System.out.println("업데이트 개수" + num);
		*/
		
		//delete
		
		Dept dept = service.selectByDeptno(99);
		System.out.println(dept);
		int num = service.delete(99);
		System.out.println("삭제된 개수 : " + num);
		Dept dept2 = service.selectByDeptno(99);
		System.out.println(dept2);
		
		Dept dept3 = service.selectByDeptno(100);
		if(dept3!=null)System.out.println(dept3);
		
		
		/*3. exception
		Dept dept2=null;
		try {
			dept2 = service.selectByDeptno(100);
		}catch(RecordNotFoundException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		//selectAll
//		List<Dept> list = service.selectAll(); 
//		for (Dept dept : list) {
//			System.out.println(dept);
//		}
//		
//		
		
	}

}
