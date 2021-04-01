package day0328;

public class Review {

	public static void main(String[] args) {
		//크기가 10개인 문자열을 담을 수 있는 배열 books를 하나 만들어서
		//책이름 5개를 배열에 넣으시오
		//어린왕자, 칼의 노래 , 연금술사, 2021 트랜드 코리아, 인연
		//크기가 10인 bookCopy 배열을 만들고,
		//bookCopy의 index 5~9에 books에 있는 내용을 복사해 넣으시오
		// books의 0~4까지를 출력하시오
		//bookCopy의 5~9까지를 출력하시오
		
		String[] books = new String[10];
		books[0] = "어린왕자";
		books[1] = "칼의 노래";
		books[2] = "연금술사";
		books[3] = "2021 트랜드 코리아";
		books[4] = " 인연";
		
		String[] bookCopy = new String[10];
		for(int i = 0; i < 5; i++) {
			bookCopy[i+5] = books[i];
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(books[i]);
		}
		System.out.println("--------------------");
		for(int i = 5; i < 10; i++) { // Ask i = 5 부터 시작하면 안되나? 되는군..
			System.out.println(bookCopy[i]);
		}
		
		// 또다른 방법
		System.out.println("--------------------");
		for(int i=0; i < 10; i++) {
			if(i < 5) {
				System.out.println(books[i]);
			}
			else {
				System.out.println(bookCopy[i]);
			}
			
		}
		
		

	}

}
