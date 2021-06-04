package dbPractice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class SelectTest {

	public static void main(String[] args) {
		// mysql커넥션객체를 담을 수 있는 변수 생성 //밑에서 닫아주기 위해 만들어놓는것
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null; //반환타입이 ResultSet이다. 내용을 반환
		
		try {
			// 커넥션을 접속하는 객체 //MyConnection에서 예외를 던졌기에 여기서 try-catch해줘야 한다. 
			conn = MyConnection.getConn();
			
			//조회하는 쿼리문 준비 ,sakila // select * from film에서 *부분을 웬만하면 채워넣어야 한다
			String sql = "select film_id,title,release_year,rental_duration,"
					+ " rental_rate, last_update from film limit 5";
			
			//Connection으로부터 Statement 객체 가져오기 ==> Statement 객체로 쿼리 실행한다. 
			statement = conn.createStatement(); 
			
			//select인 경우, 결과를 받아와야 하기에, 그 결과를 담을 수 있는 resultSet 객체로 받는다.
			//statement는 쿼리를 실행하는 객체. 그 객체로 executeQuery를 부르면 sql을 실행한다. 
			rs = statement.executeQuery(sql);
			
			// 가져온 값 꺼내오기 (resultSet에서 결과 꺼내오기
			//rs.next : 처음에 빈공간에 있다가 다음에 데이터가 있는 곳으로 이동시키기. == position을 다음 위치로 이동시킨다
			while(rs.next()) {
				 int film_id = rs.getInt(1);//컬럼을 가져온다. 담긴 내용을 가져온다.
				 String title = rs.getString(2);
				 String release_year = rs.getString(3);//문자열 타입으로 반환
				 int rental_duration = rs.getInt(4);
				 double rental_rate = rs.getDouble(5);
				 LocalDateTime last_update = rs.getTimestamp(6).toLocalDateTime();
				 System.out.println(film_id+","+title+","+release_year+","+rental_duration+","+rental_rate+","+last_update);
			}
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally { // 연결되어있는 객체가 있기에 이것을 닫아주는 것이 필요 ==> finally
			try {
				if(conn != null) {conn.close();}
				if(statement != null) {statement.close();}
				if(rs != null) {rs.close();}
			} catch (SQLException e) { //위 conn = MyConnection.getConn();가 null일 수 있기에
				e.printStackTrace(); //외부에서 받아오는 거면 닫아주는 것이 있어야 한다. 
			}
	}

}
}
