package day0502.ioex01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;


//인풋과 아웃풋을 이용하여
//127~0까지 들어간 바이트 배열을 만들고
//인풋스트림과 아웃풋 스트림을 이용하여
//새로운 배열 copy라는 바이트배열을 복사하여 넣는 코드를 작성
public class Practice {

	public static void main(String[] args) {
		byte[] array = new byte[128];
		byte[] copy;
		
		for(int i = 0; i < 128; i++) {
			array[i] = (byte)(127-i);
		}
		
		ByteArrayInputStream input = new ByteArrayInputStream(array);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		while(input.available() > 0) {
			int result = input.read();
			
			output.write(result);
		}
		
		//아웃풋에 있는 값을 copy에 담음
		copy = output.toByteArray();
		
		System.out.println(Arrays.toString(copy));
	}

}
