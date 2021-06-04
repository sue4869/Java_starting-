package dbPractice;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		// try-resource 방식 : close 방식
		// : try이 안에 객체를 만들어서 try 끝나는 시점에 close해준다. 
		try(Connection conn = MyConnection.getConn();
			Statement stmt = conn.createStatement()) {
			
			//디비명을 직접 명시 : Myconnection에서 연결해준 디비가 sakila여서 sumin 디비에 연결하려면
			String sql = "insert into sumin.book values(0,'달러구르트 꿈 백화점'"
					+ ",'주문하신 꿈은 매진입니다.','이미예', 12500,'2020-07-08',now())";
			
			
			// 인서트문 실행 - executeQuery는 반환해줌
			// 굳이 반환받지 않아도 되기에 executeUpdate : 성공했을때 성공로우 반환
			int affectedRows = stmt.executeUpdate(sql);
			
			System.out.println(affectedRows + "줄을 삽입했습니다");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
