package dbPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectTest {

	public static void main(String[] args) {
		// 디비 연동 테스트
		
		try {
			// 문자열로 클래스를 로드하는 것이기에, 프로그램 입장에서는 없는 클래스를 불러올수도 있기에
			// try- catch 사용한다. 
			// 디비에 접속하기 위한 Driver 클래스를 로드 : 로드 ==> 접속, 동적으로 클래스를 만드는 것
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//mysql에 접속하기 위한 계정을 준비
			//원래는 계정에 코드를 박아놓지 않고, 외부에서 값을 읽어오거나 파일을 읽게 오는 방법을 쓴다. 
			String user = "root";
			String password = "4869";
			
			//mysql에 접속하는 url을 셋팅
			//프로토콜://아이피주소:포트번호/데이타베이스이름?파라미터
			//포트번호는 현재는 내컴퓨터를 받아서 localhost지만 다른곳에서 받아올 경우는 거기를 써줘야 한다.
			String url = "jdbc:mysql://localhost:3307/sakila?characterEncoding=utf-8"
					+ "&serverTimezone=Asia/Seoul";
			
			//디비에 접속할 준비 끝
			//디비에 접속을 해서 접속된 커넥터 객체를 받아온다. 
			Connection conn = DriverManager.getConnection(url,user,password);
			System.out.println("커넥션 객체 :" + conn);
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// mysql에 로그인한 것과 같다. 
	}

}
