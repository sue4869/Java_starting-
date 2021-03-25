package day0321.forEx01;

public class Ex09 {

	public static void main(String[] args) {
		//1부터 100까지의 수 중 소수인 수를 출력
		
		for( int num = 2; num <= 100; num++) {
			int cnt = 0; // cnt를 0으로 되돌리기
			for(int i = 2; i < num; i++ ) {
				if (num%i== 0) {
					cnt += 1;				
				}
				}
			if (cnt == 0) {
				System.out.println(num + "는 소수입니다");
			}			
			}

	}

}
