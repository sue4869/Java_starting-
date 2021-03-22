package day0320.switchEx01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 사용자로부터 1~5 중 하나의 숫자를 입력받아
		// 해당되는 번호의 메뉴를 출력하는 코드 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5 중 하나의 숫자를 입력하세요");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			System.out.println("돈가스");
			break;
		case 2: 
			System.out.println("김밥");
			break;
		case 3:
			System.out.println("만두");
			break;
		case 4:
			System.out.println("제육");
			break;
		case 5:
			System.out.println("굶어라");
			break;
		}
		System.out.println("---------------");
		System.out.println("안녕"); //println에서 ln은 line을 말함. 출력해서 한줄내림
		System.out.print("안녕");//바로 옆에 출력됨
		System.out.printf("%s %s %s","돼지고기","오리","소고기");
		//f는 format을 의미
		// \n은 개행을 의미
		

	}

}
