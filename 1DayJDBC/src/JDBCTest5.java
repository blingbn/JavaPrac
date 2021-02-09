import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest5 {

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
			
			String sql = "delete from dept where deptno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 14);
			int num = pstmt.executeUpdate();
			System.out.println("실행된 SQL문 수 : " + (num));
			
			//deptno 14번 select 후 출력
			
			String sql2 = "select * from dept";
			pstmt = con.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " : "+ rs.getString(2) 
				+ " : " + rs.getString(3)+ " : ");
			}
			
			
			
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
