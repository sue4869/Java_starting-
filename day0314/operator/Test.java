package day0314.operator;

public class Test {

	public static void main(String[] args) {
		// 56827원 짜리 물건이 있다 이물건을 지불하기 위하여
				// 만원, 천원, 백원, 십원, 일원자리가 몇개식
				//필요한지 알아내서 출력하시오
				
				int price = 56827;
				
				int ilwon = price % 10; //7
				int sibwon = price % 100-ilwon; // 20
				int bakwon = price % 1000-price % 100; //800
				int thonwon = price % 10000-price % 1000; // 6000
				int manwon = price / 10000; //5
				
				System.out.println("만원"+ manwon+"개");
				System.out.println("천원"+ thonwon/1000+"개");
				System.out.println("백원"+ bakwon/100+"개");
				System.out.println("십원"+ sibwon/10+"개");
				System.out.println("일원"+ manwon+"개");
				//밑변과 높이를 담을 수 있는 변수를 선언하고
				//밑변과 높이에 값을 넣은 후 삼각형의 넓이 출력
				
				int height=9;
				int line=8;
				System.out.println(1/2*(height*line));
				
				//가로와 세로를 담을 수 있는 변수를 선언하고
				//가로와 세로의 값을 넣은 후 사각형의 둘레를 구하여 출력
				int a = 4;
				int b = 5;
				System.out.println(2*(a+b));

	}

}
