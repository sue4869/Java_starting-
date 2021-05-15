package day0508.fileEx01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileCopy03 {

	public static void main(String[] args) {
		//FileCopy02 클래스 생성하여
		//파일복사를 구현하는데, 속도를 올리기위해 buf배열을 이용하여 구현하시오.
		//파일 업로드되었을 때 같은 파일명은 어떻게 처리하지?
		//파일명에 날짜를 추가하는 방법
		//년월일시분초밀리초
		
		File oriFile = new File("../cat.jpg");
		
		LocalDateTime today = LocalDateTime.now();
		String todayStr = today.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
		String fileName = "rome_" + todayStr + ".jpg";
		
		File copyFile = new File("src\\day0508\\fileEx01", fileName);
		
		try (FileInputStream fin = new FileInputStream(oriFile);
			FileOutputStream fout = new FileOutputStream(copyFile)) {
			
			byte[] buf = new byte[1024];
			int len = 0;
			while(fin.available() > 0) {
				len = fin.read(buf,0,buf.length);
				fout.write(buf,0,len);
			}
			System.out.println("복사완료");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
