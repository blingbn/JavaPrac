package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class FactoryBiz {
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	public FactoryBiz() {	}
	public FactoryBiz(String driver, String url, String user, String pass) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	public ArrayList<FactoryDTO> getFactoryAll() {
		Connection con = null;
		ArrayList<FactoryDTO> list =null;
		FactoryDAO dao = new FactoryDAO();
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,pass);
			list = dao.getFactoryAll(con);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			try {
				if(con!=null)con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return null;
	}

	
	
}
