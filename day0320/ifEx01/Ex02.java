package day0320.ifEx01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 사용자(콘솔)로 부터 숫자를 입력받아보자
		// Scanner를 입력하고 ctrl+space를 한 후,
		// Scanner엺에 java.utill.Scanner 선택

		Scanner sc = new Scanner(System.in); //변수 sc
		
		System.out.println("숫자를 입력해주세요"); //사용자로부터 입력받음
		int number = sc.nextInt(); //입력받은 것을 변수에 저장
		
		System.out.println("입력받은 숫자는" + number); //출력
		System.out.println("종료");
		
	}

}
