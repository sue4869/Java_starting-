package day0508.fileEx02;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOStreamEx02 {

	public static void main(String[] args) {
		//버퍼에 쌓여 글자가 나오지 않는 코드 
		BufferedOutputStream bout = null;
		FileOutputStream fout = null;
		
		try { 
			fout = new FileOutputStream("src/day0508/fileEx02/buff.txt");
			bout = new BufferedOutputStream(fout);
			
			//버퍼에 기본적으로 8kbyte만큼 쌓인다. 
			for(int i=0; i<1024*8; i++) {
				bout.write('a');
			}
			//flush를 하면 버퍼에 있는 데이터를 파일에 작성한다. 
			bout.flush();
			
			System.out.println("파일작성완료");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
