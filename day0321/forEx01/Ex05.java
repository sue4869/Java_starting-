package day0321.forEx01;

public class Ex05 {

	public static void main(String[] args) {
		// 별짓기
//		★★★★★
//		★★★★★
//		★★★★★
		char star = '★';
		for (int a = 0; a < 3; a++) {
			for(int i = 1; i < 6; i++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
