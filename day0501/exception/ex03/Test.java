package day0501.exception.ex03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가입할 아이디를 입력하세요");
		String userId = sc.nextLine();
		
		System.out.println("가입할 비밀번호를 입력하세요");
		String password = sc.nextLine();
		
		UserCheck uc = new UserCheck(); // 채크하는 객체 만들기
		try {
			boolean result = uc.check(userId,password);
			if(result) {
				System.out.println("8자 이상으로 입력받았습니다");
			}
		}catch(InvalidUserIdException e) {
			System.out.println("아이디를 잘못 입력했습니다");
			System.out.println("아이디를 다시 입력하세요");
			userId = sc.nextLine();
		}catch(InvalidPasswordException e) {
			System.out.println("비밀번호를 잘못 입력했습니다");
			System.out.println("비밀번호를 다시 입력하세요");
			password = sc.nextLine();
		}
	}

	}


