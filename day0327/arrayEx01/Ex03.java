package day0327.arrayEx01;

public class Ex03 {

	public static void main(String[] args) {
		// 크기가 5개인 문자열을 담을 수 있는 배열을 만들어
		// 좋아하는 음식 이름 5개를 넣고
		// 출력
		
		String[] food = new String[5];
		food[0] ="딸기";
		food[1] ="떡볶이";
		food[2] ="호떡";
		food[3] ="제육";
		food[4] ="치즈돈가스";
		
		for(int i = 0; i < 5; i++) {
			System.out.println("food["+i+"] : " + food[i]);
		}
		
		//index 2를 다른 음식으로 바꿀때
		food[2] = "로제떡볶이";
		System.out.println("------변경후-----");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("food["+i+"] : " + food[i]);
		}
		
	}

}
