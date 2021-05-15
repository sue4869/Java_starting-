package day0508.fileEx01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		//파일에 데이터를 작성하는 코드
		//준비물 : 입력할 파일. 데이터, 파일아웃풋스트림
		//new file("쓰고자 하는 파일의 위치 +파일명");
		//파일의 주소 : 상대경로, 절대 경로
		//상대경로 : 상대적인 기준으로부터 위치를 표기, 현재위치로부터의 위치 예 ) ex01.txt
		//절대경로 : 루트에서부터의 위치, ex) c:/Users/workspace/ex01.txt
		//현재위치 사우이 폴더는 (..) 표기, 현재폴더는 (.)표기
		
		File file = new File("src/day0508/fileEx01/ex01.txt");
		
		//아웃풋 스트림 변수 생성
		FileOutputStream fout = null;
		//작성하는 기능이 있는 아웃풋 스트림객체를 생성
		try {
			fout = new FileOutputStream(file);
			
			//파일에 작성
			fout.write(65);
			System.out.println("파일에 데이터 65를 씀");
			fout.write(321);
			System.out.println("파일에 데이터 320을 씀");
			fout.write('A');
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			//fout에 객체가 없을때, 메서드를 호출하면 안되기 때문에 if로 null인지 확인
			if(fout != null) {
				try {
					//파일과 연결되어있는 아웃풋 스트림 객체를 닫아준다. 
					fout.close();
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
