package day0320.whileEx01;

public class Ex01 {

	public static void main(String[] args) {
		// 반복문 1
		// 형식 
//		while(조건식) {
//			조건식이 참일 때 실행할 문장 1
//			조건식이 참일 때 실행할 문장2 
//		}
		// 조건식이 false가 될때까지 반복해서 실행
	
	
	//안녕하세요 라는 문장을 20번 출력해보세요.
//	while (true) { //조건식은 true 또는 false
//		System.out.println("안녕하세요");
//	} 
	// System.out.println(""); //오류남 while(true)면 무한정 반복이라 이 문장을 출력이 안된다. 
	
	
	int num = 0; //반복계수
	while (num < 5) { //조건식
		System.out.println("안녕하세요");
		num ++; //while문 안에 있어야 한다. true인 경우 계속 while문 안에만 있으니까
				//반복계수 증가
	}
	System.out.println(num);
	//while문 밖에서의 num 값은?
	
}
}
