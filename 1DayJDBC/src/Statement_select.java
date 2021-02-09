import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_select {

	public static void main(String[] args) {

		// 1. 4가지 정보 지정 // 대소문자, 철자 주의
		String driver = "oracle.jdbc.driver.OracleDriver"; // jdbc 드라이버 클래스 경로
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // db url / sid
		String userid = "scott";// 접속 계정 (스키마)
		String passwd = "tiger"; // 접속 비밀번호

		// 2. 드라이버 생성 = > new이용
		Connection con = null; // db접속 객체 url, id, passwd필요
		// PreparedStatement pstmt = null; //sql 실행 객체 con 을 통해 생성
		Statement stmt = null; //rs를 구해오는데 사용한 Statement
		ResultSet rs = null; // 실행된 sql문의 select결과를 ResultSet객체 담아서 옴

		try {
			Class.forName(driver); //     2. 드라이버 로딩 (생성)
			System.out.println("드라이버 로딩 성공 ===========");

			// 3. 오라클 연결 (Connection 연결) : 오라클에 접속
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("==============connection 성공 " + con);
			// getConnection(주소, 스키마 아이디, 패스워드);
			// sql 사용 준비 끝

			// 4. sql작성 : 문자열로 작성, 디벨로퍼 사용 sql 사용 , ; 없음
			String sql = "SELECT deptno, dname, loc FROM dept";// 제거

			// 5. SQL실행 ==> statement, PreparedStatement, CallableStatement(PL/SQL)
			stmt = con.createStatement(); // con => Statement 객체를 생성(sql 실행 객체)
			System.out.println("stmt생성성공 ==============" + stmt);

			// 6. 실행해서 결과받기
			rs = stmt.executeQuery(sql); // sql실행 - statement.executeQuery():select, executeUpdate():DML
			System.out.println("결과 얻기 rs =============");
			while (rs.next()) { // .next()로 불러온 컬럼의 행(레코드)들을 불러올 수 있음.
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + " " + dname + " " + loc);
			}
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { //무조건 사용 후 자원 반납 - close()
			try {
				//7. 자원반납 반대순서로 실행 (만든순서의 반대로 닫아야함)
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) { //close가 안될경우의 catch
				e.printStackTrace();
			}
		}
	}
}
