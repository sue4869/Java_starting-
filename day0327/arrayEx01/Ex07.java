package day0327.arrayEx01;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		// 크기가 10인 int형 배열을 만들고, 1~100사이의 수 중 임의의 값으로 넣은 후
		// 모든 값을 출력해볼것
		//오름차순으로 정렬하여 출력
		
		int number = (int)(Math.random()*100 + 1);
		
		int[] randomNum = new int[10];
		for(int i = 0; i < 10; i++) {
			randomNum[i] = (int)(Math.random()*100 + 1);
			//System.out.println(randomNum[i]);
		}
		// 오름차순
		Arrays.sort(randomNum);
		for(int i = 0; i < randomNum.length; i++) {
			System.out.print(randomNum[i] +"\n");
		}
		System.out.println("-------------");
		// 오름차순 또다른 방법
		int b;
		for(int i = 0; i < randomNum.length-1 ; i++) { //기준이 되는 수 정하기
			for(int j= i+1; j < randomNum.length; j++) { // 기준이 되는 수 그뒤의 수를 비교
				if(randomNum[i] > randomNum[j]) {
					b = randomNum[j];
					randomNum[j] = randomNum[i];
					randomNum[i] = b;
					
					
				}
			}
		}

	}

}
