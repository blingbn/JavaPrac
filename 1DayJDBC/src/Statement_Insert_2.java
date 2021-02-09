import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_Insert_2 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		
		//2. 드라이버 생성
		Connection con = null;
		Statement stmt = null;
		
		
		try {
			Class.forName(driver);
			
			//3. 오라클 연결 (Connection 연결)
			con = DriverManager.getConnection(url, userid, passwd);
			
			//4. SQL작성
			
			String sql = "INSERT INTO DEPT VALUES("+85+",'개발', '서울')";
			
			//5. SQL실행 ==> Statement, PreparedStatement, CallableStatement(PL/SQL)
			stmt = con.createStatement();
			
			int num = stmt.executeUpdate(sql);
			
			String sql2 = "INSERT INTO DEPT VALUES("+64+",'개발2', '서울2')";
			int num2 = stmt.executeUpdate(sql2);
			
			System.out.println("업데이트 된 행의 개수 : " + (num+num2));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {//insert만 했으므로 ResultSet 필요x
			try {
				if(stmt!=null) {
					stmt.close();
				} 
				if(con!=null) {
					con.close();
				} 
				if(con!=null) {
					con.close();
				} 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
