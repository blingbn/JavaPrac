import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductManagerMain2 {

	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "tester";
		String passwd = "tester";

		// 2. 드라이버 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("매출 조회 메뉴 - [매출 일자순 : 1, 상품별 매출순 : 2]");
			int num = scan.nextInt();

			if (num == 1) {
				sql = "SELECT ODATE 영업일, sum(QUANTITY*PRICE) 매출 FROM D7_ORDER O JOIN D7_PRODUCT P "
						+ "USING(PID) GROUP BY O.ODATE ORDER BY 1 ";

				//sql = "SELECT TO_CHAR(ODATE, 'YYYY-MM-DD') 영업일, SUM(O.QUANTITY*P.PRICE) 매출 "
				 //+"FROM D7_ORDER O JOIN D7_PRODUCT P USING(PID) GROUP BY ODATE ORDER BY 1";
			} else {
				sql = "SELECT PNAME 상품명, SUM(O.QUANTITY*P.PRICE) 매출 FROM "
						+ "D7_ORDER O JOIN D7_PRODUCT P USING(PID) GROUP BY P.PNAME ";
				 //sql = "SELECT PNAME 상품명, SUM(O.QUANTITY*P.PRICE) 매출 "
						//+ "FROM D7_ORDER O JOIN D7_PRODUCT P USING(PID) GROUP BY PNAME ORDER BY 2 DESC";
			}

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("==============================================");
			System.out.println(((num == 1) ? "영업일" : "상품명") + "\t\t\t 매출");
			System.out.println("==============================================");

			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t "+rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
