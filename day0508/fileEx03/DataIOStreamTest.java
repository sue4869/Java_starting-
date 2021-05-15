package day0508.fileEx03;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DataIOStreamTest 클래스 생성
//1. 구구단을 파일에 작성하여 읽어오는 코드를 작성해보세요.(문자열)
//2. 로또 번호를 생성하여 파일에 정수로 저장을 하고, 읽어오는 코드를 작성해보세요.(정수)
public class DataIOStreamTest {

	public static void main(String[] args) {
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("src/day0508/fileEx03/gugu.txt"))){
			
			String str = "";
			for (int i = 2; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					str +=(i+"*"+j+"="+(i*j)+" ");
				}
				str +="\n";
			}
			dout.writeUTF(str);
			dout.flush();
			System.out.println("파일작성완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
