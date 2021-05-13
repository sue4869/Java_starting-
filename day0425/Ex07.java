package day0425;

import java.io.IOException;

//에외를 직접처리하지 않을 때 ==> 위임하기
//어떤 흐름이 예외처리가 되었는지 확인할 수 있다
public class Ex07 {

	public static void main(String[] args) {
		try {
			String str = readString();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	//메서드가 문자열을 받을 때 처리하도록 // 키원드 : throws
	//이 메서드를 호출할때 처리해줘야 하는 에외 적어주기
	public static String readString() throws IOException {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하세요");
		
		System.in.read(buf);
		
		return new String(buf);
	}

}
