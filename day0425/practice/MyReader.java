package day0425.practice;

import java.io.IOException;

public class MyReader {
	public static String MyReader() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하세요");
		
		System.in.read(buf);
		
		return new String(buf);
	}
}
