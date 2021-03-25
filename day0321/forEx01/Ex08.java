package day0321.forEx01;

public class Ex08 {

	public static void main(String[] args) {
		// 1 2 3 4 5 
		// 6 7 8 9 10
		// 11 12 13 14 15
		for(int i = 0 ; i < 3; i++) {
			for(int j = 1; j < 6; j++) {
				System.out.print((j+(5*i)));
				System.out.print(" ");
			}
			System.out.println();
		}
		
		// 1 2 3 4 5	// 1 + 0
		// 10 9 8 7 6   // 5 + 5 --> i-1 = 1
		// 11 12 13 14 15 // 1 + 10 --> i-1 = 2 * 5
		// 20 19 18 17 16 // 5 + 15 -- i-1 = 3
		// 21 22 23 24 25 // 1 + 20  ---> i-1 = 4 * 5
		for(int i = 1; i < 6; i++) {
			if (i%2 == 0) { // 짝수줄일때
				for(int j = 5; j > 0; j--) {
					System.out.print(j+(5*(i-1)));
					System.out.print(" ");
				}
				System.out.println( );
			}
			else { //홀수줄일때 
				for(int j = 1;j < 6; j++) {
					System.out.print(j + (i-1)*5);
					System.out.print(" ");
				}
			System.out.println( );
		}
		
		
		}

	}

}
