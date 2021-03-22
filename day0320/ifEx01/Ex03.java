package day0320.ifEx01;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 사용자로부터 0~100의 점수를 입력받는다
		//100점이면 "만점입니다"
		//90~99점이면 "A"학점
		//80~89점이면 "B"학점
		//70~79점이면 "C"학점
		//나머지는 "F"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("본인의 점수를 입력하세요");
		int score = sc.nextInt();
		if ( score == 100 ) { //100은 int
			System.out.println("만점입니다");
		}
		else if (score >= 90 ) {
			System.out.println("A 입니다");
		}
		else if (score >= 80 ) {
			System.out.println("B 입니다");
		}
		else if (score >= 70 ) {
			System.out.println("C 입니다");
		}
		else {
			System.out.println("F 입니다");
		}

	}

}
