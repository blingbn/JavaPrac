import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest3 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		
		//2. 드라이버 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, userid, passwd);
			
			String sql = "insert into dept (deptno, dname, loc)" + "values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 13);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "서울");
			int num = pstmt.executeUpdate();

			
			pstmt.setInt(1, 14);
			pstmt.setString(2, "개발2");
			pstmt.setString(3, "서울2");
			int num1 = pstmt.executeUpdate();
			System.out.println("실행된 SQL문 수 : " + (num+num1));
	
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					if(pstmt!=null) {
						pstmt.close();
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
