package day0327.arrayEx01;

public class Ex06 {

	public static void main(String[] args) {
		// 배열의 활용
		// 1.크기가 5인 int 타입의 배열 numbers을 만들어 3의 배수를 넣으시오
		System.out.println('z'-'a'+1);// 알파벳 개수
		System.out.println('a' - 'A'+1);
		// 2.크기가 26개인 char배열을 만들어 a~z까지의 값을 넣고 출력하세요
		// 3.크기가 26개인 copyAlpa를 만들어 alpha의 값을 복사해 넣고 출력하세요
		// 4.copyAlpha를 이용하여 알파벳을 대문자로 출력하시오
		
		System.out.println("--------------------");
		
		//1.크기가 5인 int 타입의 배열 numbers을 만들어 3의 배수를 넣으시오
		int[] numbers = new int[5];
		for(int i = 0; i < 5; i++) {
			numbers[i] = 3*(i+1);
		}
		
		System.out.println("--------------------");
		
		// 2.크기가 26개인 char배열을 만들어 a~z까지의 값을 넣고 출력하세요
		char[] alpabet = new char[26];
		for(int i = 0; i < 26; i++ ) {
			alpabet[i] = (char)(i+97);
		}
		for(int i = 0; i < 26; i++ ) {
			System.out.println(alpabet[i]);
		}
		System.out.println("--------------------");
		
		// 3.크기가 26개인 copyAlpa를 만들어 alpha의 값을 복사해 넣고 출력하세요
		char[] copyAlpa = new char[26];
		for(int i = 0; i < 26; i++) {
			copyAlpa[i] = alpabet[i];
		}
		for(int i = 0; i < 26; i++ ) {
			System.out.println(copyAlpa[i]);
		}
		System.out.println("--------------------");
		// 4.copyAlpha를 이용하여 알파벳을 대문자로 출력하시오
		for(int i = 0; i < 26; i++) {
			System.out.println((char)(copyAlpa[i]-33));
			
		}
		
	}

}
