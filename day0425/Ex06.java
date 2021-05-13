package day0425;

import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		String str = readString(); //static 속에서 메서드 호추라려면 메서드도 static으로
		System.out.println(str);
	}
	
	//메인이외의 메서드를 따로 만듦 ==> 전체 흐름상 어디서 잘못되었는지 모른다. 
	public static String readString() {
		byte[] buf = new byte[100];
		System.out.println("문자열을 입력하세요");
		
		//콘솔로부터 문자를 입력받아 buf에 담는 메서드
		try {
			System.in.read(buf); //클래스, 멤버변수, 멤버변수의 또다르 메서드
			// 반드시 trycatch로 감싸줘야 한다. 
			// checkedException ==> 디버그시에 미리 체크해서 예외를 처리하는 코드를 작성하도록 한다.
			//System.in.read : 입력버퍼에 데이터가 있는지 찾는다. 
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//byte를 문자열로 변환시켜서 내보내기
		return new String(buf);
	}

}
