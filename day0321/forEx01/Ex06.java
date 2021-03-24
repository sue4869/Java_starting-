package day0321.forEx01;

public class Ex06 {

	public static void main(String[] args) {
		//10개씩 9줄! 만들어보세요.
//		♡♡♡♡♡♡♡♡♡♡
//		♡♡♡♡♡♡♡♡♡♡
//		♡♡♡♡♡♡♡♡♡♡
//		♡♡♡♡♡♡♡♡♡♡
//		♡♡♡♡♡♡♡♡♡♡
//		♡♡♡♡♡♡♡♡♡♡
//		♡♡♡♡♡♡♡♡♡♡
//		♡♡♡♡♡♡♡♡♡♡
//		♡♡♡♡♡♡♡♡♡♡
		char heart = '♥';
		for(int i=0; i < 9; i++) {
			for(int j=0; j < 10; j++) {
				System.out.print(heart);
			}
			System.out.println(" ");
		}
		//♡
		//♡♡
		//♡♡♡
		//♡♡♡♡
		//♡♡♡♡♡
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(heart);
			}
			System.out.println(" ");
		}
		
		//♡♡♡♡♡
		//♡♡♡♡
		//♡♡♡
		//♡♡
		//♡
		for(int i = 1; i < 6; i++) {
			for(int j = 5; j >= i; j--) {
				System.out.print(heart);
			}
			System.out.println(" ");
		}
//		1부터 100까지의 총 합은?
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
