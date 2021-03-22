package day0320.ifEx01;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// 사용자로부터 0~299사이의 숫자를 입력받아
		// 아래 조건에 맞도록 출력!
		// 사이즈가 0~99면 "미꾸스몰"
		// 사이즈가 100 ~199면 "미꾸미디움"
		// 사이즈가 200~299이면 "미꾸라지"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~299사이의 사이즈를 입력해주세요");
		int size = sc.nextInt();
		if (size < 100) {
			System.out.println("미꾸스몰");
		}
		else if (size < 200) {
			System.out.println("미꾸미디움");
		}
		else {
			System.out.println("미꾸라지");
		}

	}

}
