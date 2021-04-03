package day0327;

public class review {

	public static void main(String[] args) {
		// 1부터 100까지의 수 중 소수인 수를 출력
		// 1) 소수를 찾기 --> 1과 자기 자신만 약수로 갖는 수 
		for(int num = 2; num <= 100; num++) {
			int cnt = 0;
			for(int i = 1; i <= num; i++) {
				if( num % i == 0) {
					cnt ++;
				}
			}
			if(cnt == 2) {
				System.out.println(num);
			}
		}
		
		// 두수의 최대 공약수
		//120 50
		//1. 약수를 구하자
		int a = 120; // 1 2 3 4 5 6 8 10 12 15 120 30 40 60 120
		int b = 50; // 1 2 5 10 25 50
		for( int i = 1; i <= a; i++) { //a의 약수 구하기
			if(a % i == 0) {
				System.out.println(i);
			}
		}
		for(int i = 1; i <= b; i++) { //b의 약수 구하기
			if(a % i == 0) {
				System.out.println(i);
			}
		}
		
		//2. 공약수 구하기 // 더 작은 수까지만 구하기면 되네?
		int n = (a < b)? a : b ; // a와 b중 더 작은 수 = n
		for(int i = 1;  i <= n; i++ ) {
			if(a % i == 0 && b % i == 0) {
				System.out.println("소수는 " + i);
			}
		}
		
		// 3. 그 중 가장 큰 수 를 구하기
		int gc = 0;
		int m = (a < b)? a : b ;
		for(int i = 1;  i <= m; i++ ) {
			if(a % i == 0 && b % i == 0) {
				gc = i;
			}
		}
		System.out.println("최대공약수는"+ gc);
		
		// 또다른 방법 . 가장 큰수 부터 시작하기 
		
		int k = (a < b)? a : b ;
		int gc2 = n; // 수정
		for(int i = k;  i >= 1; i-- ) {//
			if(a % i == 0 && b % i == 0) {
				gc2 = i;
				break; // 최초의 참이 되는 순간
			}
		}
		System.out.println("최대공약수는"+ gc2);
		// 공약수는 10
	
	
	// 최소공배수 : (두 수 곱 / 최대 공약수)
	//  120 50
	// 2  60 25
	// 5  12 5   ---> 2 * 5 * 12 * 5
		
		int gcd = (a * b / gc );
		
		
		
	}
}
