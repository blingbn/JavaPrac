import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest3 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "tester";
		String passwd = "tester";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			
			String sql = "INSERT INTO DISCARDED_PRODUCT (SELECT PDNO, PDNAME,PDSUBNAME,FACTNO, PDDATE,PDCOST,PDPRICE,PDAMOUNT,"
					+ "SYSDATE FROM PRODUCT WHERE FACTNO = (SELECT FACTNO FROM FACTORY WHERE FACLOC ='CHANGWON'))";
			
			pstmt = con.prepareStatement(sql);
			int count = pstmt.executeUpdate();
			System.out.println(count+"개의 데이터가 정상적으로 INSERT 되었습니다.");
con.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				}if(con!=null) {
					con.setAutoCommit(true);
					con.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
