import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Statement_Insert_1 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			
			int deptno = 88;
			String dname = "개발";
			String loc = "서울";
			String sql2 = "INSERT INTO DEPT VALUES("+deptno+",'"+dname+"','"+loc+"')";
			//String sql1 = "insert into dept (deptno, dname, loc)" + "values ("+deptno+",'"+dname+"','"+loc+"')";
			stmt = con.createStatement();
			System.out.println(sql2);
			int result = stmt.executeUpdate(sql2); // executeUpdate ==> 실행 후 insert된 행의 개수
			System.out.println("실행된 레코드 수 : " + result);
			
			//jdbc dml은 자동 commit; insert, delete, update 커밋을 안해주어도 자동 커밋이 됨.
			//autoCommit이 이루어짐
			
			
			String sql = "select deptno, dname, loc from dept";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				deptno = rs.getInt("deptno");
				dname = rs.getString("dname");
				loc = rs.getString("loc");
				System.out.println(deptno + " " + dname + " " + loc); //아래것도 가능	
				//System.out.println(rs.getInt(1)+ ":" + rs.getString(2) + ":" + rs.getString(3)); //컬럼 index번호로 불러오는 것
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
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
	}

}
