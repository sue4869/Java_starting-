package day0321.forEx01;

public class Ex03 {

	public static void main(String[] args) {
		// 1에서 100의 수 중 3의 배수는?
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0) {
			System.out.println(i);
			}
		}
		System.out.println("------------");
		//1~100의 수 중 3의 배수와 5의 배수를 출력해라
		int cnt = 0; 
		for(int i = 1; i < 100; i++) {
			if (i%3 ==0 || i %5 == 0) {
				System.out.println(i);
				cnt ++;
			}
		}
		System.out.println(cnt + "개 있습니다");
		System.out.println("------------");
		
		//임의의 수는 소수인가?
		// 1) Math.random() -> double형으로 0 ~ 0.99999
		// 2) 0 ~ 99 : int로 변형
		// 3) 1 ~ 100 : +1한다.
		// (int)(Math.random()*정수의 개수) + 랜덤의 시작값;
		int number = (int)(Math.random()*100) +1;
		//1부터 100까지의 숫자 중 랜덤으로 하나의 숫자를 만들겠다.
		
		//소수는 약수가 1과 자기자신인 아이! 나눌 수 있는 숫자가 2개
		//2(1,2)
		//number을 자기자신을 포함한 작은 수로 나누었을때 나머지가 0인것이 2개여야 한다. 
		// number % a == 0 ---> 2개
		int cnt2 = 0;
		for (int a = 1; a < (number - 1); a++) {
			if(number % a == 0) {
				cnt2++;
			}	
		}
		if (cnt2 == 2) {
			System.out.println(number + "는 소수입니다");	
		}
		else {
			System.out.println(number +"는 소수가 아닙니다");
		}
	}

}
