//변수의 선언과 초기화
package java0313.variable.ex01;

public class Ex02 {
	public static void main(String[] args) {
		// 초기화 : 그릇에 값을 넣기
		// 정수 
		int myInt = 2000000;
		long myLong = 20000000l;//숫자를 기본적으로 int로 인식. long쓸때는 숫자 뒤에 l(L)을 붙인다
								//long은 int보다 포용하는 숫자가 크니까 더 큰 숫자가 long쓴다는 표시
		
		// 실수
		float myFloat = 3.14444f; //숫자를 처음에 double로 인식하기에 f 써줘야함
								  //double보다 float이 포용하는 범위가 적어서
		double myDouble = 3.14444444;
		
		// 논리
		boolean myBoolean = true;
		
		// 문자
		char myChar = 'a';
	
//breakpoint : 옆에 파란색 지점 더블클릭하여 벌레모양(디버그모드) 실행하면 거기 지점까지만 실행됨
//실행 후 정지버튼 옆옆의 step over 누르면 그 다음한줄한줄씩 볼수있다
//디버그 모드 하다가 원래 전체실행 : open perspective >> java

}
}
