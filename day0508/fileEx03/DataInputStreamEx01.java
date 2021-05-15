package day0508.fileEx03;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamEx01 {

	public static void main(String[] args) {
		try(DataInputStream din = new DataInputStream(new FileInputStream("src/day0508/fileEx03/DataIOEx01.txt"))){
			
			//쓴 자료형과 똑같이 읽어줘야 한다. 
			int data = din.readInt();//4바이트를 읽어옴
			String str = din.readUTF();//문자열을 읽어옴.
			
			System.out.println("정수 :" + data);
			System.out.println("문자열 :" +str);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
