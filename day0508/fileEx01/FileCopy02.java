package day0508.fileEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy02 {

	public static void main(String[] args) {
		//FileCopy02클래스 생성하여
		//파일복사를 buf배열(지난 수업의 bagagi)를 이용하여 구현하시오
		
		File oriImageFile = new File("../dog.jpg");
		File copyImageFile = new File("C:\\Program Files\\java\\eclipse\\day0508\\src\\day0508\\fileEx01", "copyImage2.jpg");
		
		//인풋에는 원본과 연결한다. 
		//아웃풋에는 복사본 파일과 연결한다. 
		try(FileInputStream fin = new FileInputStream(oriImageFile);
			FileOutputStream fout = new FileOutputStream(copyImageFile)){
			
			//원본에서 읽어 복사본에 쓰자 
			byte[] bagagi = new byte[300];
			
			int data = -1;
			while((data = fin.read(bagagi, 0, 300)) != -1) {
				fout.write(bagagi, 0, data);
			}
			System.out.println("파일 복사 완료");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}

	

	
