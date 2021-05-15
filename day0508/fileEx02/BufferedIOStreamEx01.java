package day0508.fileEx02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BufferedIOStreamEx01 {

	public static void main(String[] args) {
		// 파일을 인풋, 아웃풋 스트림에 연결
		//인풋, 아웃풋 스트림을 버퍼스트림에 연결
		
		File oriFile = new File("../cat.jpg");
		
		LocalDateTime today = LocalDateTime.now();
		String todayStr = today.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
		String fileName = "rome_" + todayStr + ".jpg";
		
		File copyFile = new File("src\\day0508\\fileEx02", fileName);
		
//		//파일에 파일 인풋스트림을 연결
//		FileInputStream fin = new FileInputStream(oriFile);
//		//인풋스트림을 버퍼드인풋스트림에 연결
//		BufferedInputStream bin = new BufferedInputStream(fin);
		
		try( BufferedInputStream bin = new BufferedInputStream(new FileInputStream(oriFile));
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(copyFile))){
			
			byte[] buf = new byte[1024];
			
			int len = 0;
			while(bin.available() > 0) {
				len = bin.read(buf,0,buf.length);
				bout.write(buf,0,len);
				
				//버퍼드스트림 안쪽에 있는 버퍼를 비워주는 메서드를 호출해야한다. 
				bout.flush();//bufferOutputStream이 close될때도 호출된다. 
			}
			System.out.println("파일 작성 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


