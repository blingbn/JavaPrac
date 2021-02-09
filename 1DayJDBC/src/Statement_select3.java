import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Statement_select3 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "select deptno x, dname, loc from dept";
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + "\t" + dname + "\t" + loc);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				} 
				if(stmt!=null) {
					stmt.close();
				} 
				if(con!=null) {
					con.close();
				} 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}//ends main
}
