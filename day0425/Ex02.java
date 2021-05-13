package day0425;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 10개짜리 int형 배열을 만들고
		// 배열과 관련된 예외를 발생시켜보세요
		
		int[] num = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("넣을 배열의 크기를 입력하세요");
		int length = sc.nextInt();
		if(length == 10) {
			for(int i = 0; i < length; i++) {
				num[i] = i;
			}
			for(int i = 0; i < length; i++) {
				System.out.println(num[i]);
			}
		}
		else {
			System.out.println("해당크기로는 안됩니다. ");
		}
	}

}
