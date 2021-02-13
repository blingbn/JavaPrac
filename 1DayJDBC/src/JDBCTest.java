import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		
		//2. 드라이버 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, userid, passwd);
			
			String sql = "select deptno x, dname, loc from dept";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname= rs.getString("dname");
				String loc= rs.getString("loc");
				System.out.println(deptno + " " + dname + " " + loc);
				
			}
			
		} catch (Exception e) {

		}
	}

}