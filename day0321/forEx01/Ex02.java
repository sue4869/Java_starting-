package day0321.forEx01;

public class Ex02 {

	public static void main(String[] args) {
		// 1~5까지 수를 출력하는 for문
		for(int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println("------------");
		
		//5~1까지 5 4 3 2 1로 출력하는 for문
		for(int j = 5; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("-------------");
//for문은 블럭 단위라서 i가 for문 안에서 생겨났다가 for문 안에서 사라지기 때문에 (스택)
//i를 또 쓸 수 있다.
		
		
		// 3 6 9 12 15 18를 출력하는 for문
		for(int i = 3; i < 16; i+=3 ) { //for은 일정 횟수대로 반복하는거라
			System.out.println(i); // 이것은 코드 가독성에 안좋다
		}
		System.out.println("-------------");
		
		for(int i = 1; i < 6; i++) {
			System.out.println(3*i);
		}
	}
	

}
