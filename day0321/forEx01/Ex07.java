package day0321.forEx01;

public class Ex07 {

	public static void main(String[] args) {
		// 구구단
		//2~9단
		for (int dan = 2; dan < 10; dan++) {
			for (int i = 1; i < 10; i++ ) {
				System.out.print(dan+"*"+i+"="+ (dan*i));
				System.out.println(" ");
			}
			System.out.println();
		}

	}

}
