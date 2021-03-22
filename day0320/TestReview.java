package day0320;

public class TestReview {

	public static void main(String[] args) {
		// 56827원짜리 물건이 있다. 이물건을 지불하기 위하여
		// 만원,천원,백원,십원,일원짜리가 몇개씩 필요한지 출력
		
		int money = 56827;
		int manwon = (money / 10000);//5
		int chanwon = (money % 10000)/1000;//6
		int bakwon = (money % 1000)/100;
		int sibwon = (money % 100)/10;
		int ilwon = (money%10);
		
		System.out.println(manwon);
		System.out.println(chanwon);
		System.out.println(bakwon);
		System.out.println(sibwon);
		System.out.println(ilwon);
		
		System.out.println("--------------");
		
		//밑변과 높이를 담을 수 있는 변수를 선언하고
		//밑변과 높이에 값을 넣은 후 삼각형의 넓이 출력
		
		int line = 5;
		int height = 9;
		int area = (line*height)/2;
		System.out.println(area);
		
		System.out.println("--------------");
		//가로와 세로를 담을 수 있는 변수를 선언하고
		//가로와 세로의 값을 넣은 후 사각형의 둘레를 구하여 출력
		
		int width = 2;
		int high = 3;
		int circum = 2*(width+high);
		System.out.println(circum);
		

	}

}
