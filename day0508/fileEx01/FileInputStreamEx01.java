package day0508.fileEx01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {

	public static void main(String[] args) {
		// 파일을 읽어오는 기능을 구현
		//준비물: 읽어올 파일, 파일인풋스트림 객체
		//파일객체 대신 파일 주소로 가능함 
		
		FileInputStream fin = null;
		
		//파일 인풋에 파일을 연결한 객체 생성
		try {
			fin = new FileInputStream("src/day0508/fileEx01/ex01.txt");
			
			int data = -1;
			while((data=fin.read()) != -1) {
				System.out.println(data);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fin != null) {
				try {
					fin.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
