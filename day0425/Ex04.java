package day0425;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		try {
			int num = sc.nextInt();
		}catch(Exception e) {
			//예외발생종류를 모를때
			System.out.println("예외발생");
		}finally {
			sc.close();
			System.out.println("클로즈함");
		}
	}
	//숫자를 써야 하는데 문자열을 입력하면 예외발생한다. 
	// finally는 try또는 catch에서 return이 되도록 실행한다. 
}
