package day0425.practice;

import java.io.IOException;

public class MyReaderTest {
	public static void main(String[] args) {
		
	MyReader myReader = new MyReader();
	try {
		String str = myReader.MyReader();
		System.out.println(str);
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
