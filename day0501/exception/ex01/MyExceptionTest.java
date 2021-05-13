package day0501.exception.ex01;

import java.util.Scanner;

public class MyExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0이 아닌 숫자를 입력하세요");
		int num = sc.nextInt();
		try {
			if(num==0) {
				throw new MyException();
			}else {
				System.out.println(num + "을 입력받았습니다");
			}
		} catch (MyException e) {
			System.out.println("0을 입력받았습니다");
			System.out.println("잘못입력하였으니 다시 입력하세요");
		}
	}

}
