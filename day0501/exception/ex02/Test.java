package day0501.exception.ex02;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가입할 아이디를 입력하세요");
		String userId = sc.nextLine();
		System.out.println("userId:" + userId);
		
		UserIdCheck uic = new UserIdCheck(); // 채크하는 객체 만들기
		try {
			boolean result = uic.check(userId);
			if(result) {
				System.out.println("8자 이상으로 입력받았습니다");
			}
		}catch(InvalidUserIdException e) {
			System.out.println("잘못 입력함");
		}
	}

	}


