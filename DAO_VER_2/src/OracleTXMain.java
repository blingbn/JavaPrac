import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTXService;

public class OracleTXMain {

	public static void main(String[] args) {
		
		OracleTXService service = new OracleTXService();
		
		try {
			ArrayList<Dept> list = service.select();
			for(Dept d : list) {
				System.out.println(d);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int deptno = 99;
		String dname="개발";
		String loc = "제주";
		Dept xx = new Dept(deptno, dname, loc);
		service.insert(xx);
		
		//1번 클릭
		try {
			ArrayList<Dept> list = service.select();
			for(Dept dept : list) {
				System.out.println(dept);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		//3번 클릭
		Dept xx2 = new Dept(99, "경제", "서울");
		try {
			service.update(xx2);
		}catch(RecordNotFoundException e1) {
			System.out.println(e1.getMessage());
		}
		
		
		//4번 클릭 
		service.delete(99);
	}

}
