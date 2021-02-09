import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest1 {

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
			String dname = "개발";
			String sql = "select deptno, dname, loc from dept where dname = ?";
			pstmt = con.prepareStatement(sql);
			System.out.println("dname이 개발인 부서의 정보==============");
			pstmt.setString(1,dname);
			rs = pstmt.executeQuery();
			
			//6. 실행해서 값 받아오기
				while (rs.next()) {
					System.out.println(rs.getInt(1)+ " : "+ rs.getString(2) 
					+ " : " + rs.getString(3)+ " : ");
				}
			System.out.println();
			String loc = "서울";
			String sql2 = "select deptno, dname, loc from dept where loc = ?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setString(1,loc);
			rs = pstmt.executeQuery();
			System.out.println("loc가 서울인 부서의 정보===============");
				while (rs.next()) {
					System.out.println(rs.getInt(1)+ " : "+ rs.getString(2) 
					+ " : " + rs.getString(3)+ " : ");
				}
			System.out.println();
			
			
			String sql3 = "insert into dept values (?, ?, ?)";
			pstmt = con.prepareStatement(sql3);
			pstmt.setInt(1,98);
			pstmt.setString(2,"인사");
			pstmt.setString(3,"부산");
			int num = pstmt.executeUpdate();
			System.out.println("실행된 SQL문 수 : " + num );
			System.out.println();
			
			
			int deptno = 98;
			String sql4 = "select deptno, dname, loc from dept where deptno = ?";
			pstmt = con.prepareStatement(sql4);
			System.out.println("deptno가 98인 부서의 정보================");
			pstmt.setInt(1, deptno);
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
