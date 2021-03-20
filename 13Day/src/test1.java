import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test1 {

	public static void main(String[] args) {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userid ="scott";
		String passwd ="tiger";
		
		Connection con = null;
		PreparedStatement pstmt =null;
		ResultSet rs =null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");

			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("커넥션 연결 성공");
				
			String sql="select deptno,dname,loc from dept order by 1 desc ";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println(deptno+" "+dname+" "+loc);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}	
	}//ends main
}//ends class
