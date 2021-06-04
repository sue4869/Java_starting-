package dbPractice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		try(Connection conn = MyConnection.getConn();
			Statement stmt = conn.createStatement()) {
			
			//수정 쿼리 작성
			String sql = "update sumin.book set price = 13800 where book_id = 4";
			
			int affectedRows = stmt.executeUpdate(sql);
			System.out.println(affectedRows + " 줄 수정");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} 

	}

}
