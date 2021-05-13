package day0425.practice;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = sc.nextInt();
		MyExcept myexcept = new MyExcept(); //객체를 안만들어서 static을 넣으라고 한것
		
		try {
			myexcept.makeException(num);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
