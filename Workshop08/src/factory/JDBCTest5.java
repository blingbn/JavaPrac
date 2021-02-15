package factory;

import java.util.ArrayList;

public class JDBCTest5 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "tester";
		String pass = "tester";
		
		FactoryBiz biz = new FactoryBiz(driver, url, user, pass);
		ArrayList<FactoryDTO> list = biz.getFactoryAll();
		System.out.println("공장번호\t\t공장명\t\t공장위치");
		for(FactoryDTO dto : list) {
			System.out.printf("%s\t\t%s\t\t%s\n", dto.getFacNo(), dto.getFacName(), dto.getFacLoc());
		}
		
	}
}
