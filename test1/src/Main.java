import com.service.OracleService;


public class Main {

	public static void main(String[] args) {

		OracleService service = new OracleService();

		int deptno = 99;
		String dname="영업부";
		String loc ="경기도";
		
		int num = service.insert(deptno, dname, loc);
		System.out.println("추가된 레코드 개수 : " + num);	
	}
}
