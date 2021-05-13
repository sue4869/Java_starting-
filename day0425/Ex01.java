package day0425;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나누려는 숫자를 입력하세요");
		
		int num = sc.nextInt();
		
		if(num != 0) {
			System.out.println(10/num);
		} else {
			System.out.println("0으로는 나눌 수 없음");
		}
		//예외가 발생하면 그 밑의 코드는 실행이 안된다 ==> 강제종료

	}

}
