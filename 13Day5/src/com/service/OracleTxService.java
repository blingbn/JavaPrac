package com.service;

public class OracleTxService {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String userid ="scott";
	String passwd ="tiger";
	public OracleTxService() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end OracleDAO
}
