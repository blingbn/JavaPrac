import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTxService;

public class OracleTxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OracleTxService service = new OracleTxService();
		
		
		
		
		//2번클릭
		int deptno = 99;
		String dname="영업";
		String loc ="경기도";
		Dept xx =new Dept(deptno, dname, loc); 
		service.insert(xx);
		
		
		/*
		//1번클릭
		try {
			ArrayList<Dept> list= service.select();
			for (Dept dept : list) {
				System.out.println(dept);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

}