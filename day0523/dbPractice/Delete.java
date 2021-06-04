package dbPractice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		try(Connection conn = MyConnection.getConn();
			Statement stmt = conn.createStatement()) {
				
				String sql = "delete from sumin.books where book_id=6";
				
				//쿼리문 실행
				int affectedRows = stmt.executeUpdate(sql);
				System.out.println(affectedRows+"줄삭제");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			

	}

}
