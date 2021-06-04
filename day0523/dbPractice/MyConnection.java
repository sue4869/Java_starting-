package dbPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//쿼리를 실행할때마다 접속을 할 수 없으니 connection만 코드를 따로 빼놓는게 좋다
public class MyConnection {
	public static Connection getConn() throws ClassNotFoundException, SQLException {
			// 디비에 접속하기 위한 Driver 클래스를 로드 : 로드 ==> 접속, 동적으로 클래스를 만드는 것
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//mysql에 접속하기 위한 계정을 준비
			String user = "root";
			String password = "4869";
			
			//mysql에 접속하는 url을 셋팅
			//프로토콜://아이피주소:포트번호/데이타베이스이름?파라미터
			String url = "jdbc:mysql://localhost:3307/sakila?characterEncoding=utf-8"
					+ "&serverTimezone=Asia/Seoul";
			
			//디비에 접속할 준비 끝
			
			//디비에 접속을 해서 접속된 커넥터 객체를 받아온다.
			return DriverManager.getConnection(url,user,password);
			//예외를 던졌기에 실행하는 쪽에서 오류를 막는 try-catch를 써야 한다. 
	}
}
