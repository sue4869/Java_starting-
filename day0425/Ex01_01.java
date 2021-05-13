package day0425;

public class Ex01_01 {

	public static void main(String[] args) {
		// 0으로 나누는 경우
		int number1 = 0;
		int number2 = 10;
		
//		try {
//			예외가 발생할것 같은 문장
//		}catch(캐치할 예외의 종류) {
//			예외가 발생했을 때 실행할 문장
//		}
		
		try {
			System.out.println(number2/number1);
		}
		catch(ArithmeticException e) { // 자료형 변수 형태로 마치 메서드에 파라미터 넣어주는 방식
			//예외가 예외 객체 e로 들어간다. 
			System.out.println("0으로 나누려했다.");
		}
		System.out.println("끝");
			
		}

	}


