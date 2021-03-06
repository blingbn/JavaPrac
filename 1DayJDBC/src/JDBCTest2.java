import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2 {

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
			
			String sql = "insert into dept (deptno, dname, loc)" + "values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 99);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "서울");
			
			//6. 실행해서 값 받아오기
			int num = pstmt.executeUpdate();
			System.out.println("실행된 SQL문 수 : " + num );
			
			String sql2 = "select deptno, dname, loc from dept where deptno= ?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setInt(1, 99);
			rs = pstmt.executeQuery();
				
				while (rs.next()) {
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
