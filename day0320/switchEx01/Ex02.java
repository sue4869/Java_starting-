package day0320.switchEx01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 성적을 표현하기는? 
		//100점이면 "만점입니다"
		//90~99점이면 "A"학점
		//80~89점이면 "B"학점
		//70~79점이면 "C"학점
		//나머지는 "F"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오");
		int score = sc.nextInt();
		
		switch(score/10) { //int값을 int로 나누기에 뒤에 소숫점 날리니까 가능
		case (10):
			System.out.println("만점");
			break;
		case (9):
			System.out.println("A");
			break;
		case (8):
			System.out.println("B");
			break;
		case (7):
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		
		System.out.println("--------------");
		// 한 블럭 속의 case가 참이면 break를 만날때까지 나머지 case 는 무시된다.
		switch(score) {
		case 100:
			System.out.println("만점");
			break;
		case 99: case 98: case 97: case 96: case 95:
		case 94: case 93: case 92: case 91: case 90:
			System.out.println("A");
			break;
		case (8):
			System.out.println("B");
			break;
		case (7):
			System.out.println("C");
			break;
		default:
			System.out.println("F");
			break;
		}
		// 범위 --> if
		// case의 경우 -->switch
			
		}
		

	}


