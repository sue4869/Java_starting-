package day0425;

public class Ex05 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
//		catch(Exception e) { //Exception은 모든 예외처리의 부모
//			System.out.println("예외 발생");
//		}catch(ArrayIndexOutOfBoundsException e) { //코드상 올 수 없는 코드입니다라는 에러가 뜬다
//												   //위에서 다 캐치해버림
//			System.out.println("숫자 관련 예외");
//		}
		//만약 구분하고 싶다면 부모가 밑으로 가게 해야 한다. 
		catch(ArithmeticException e) {
			System.out.println("숫자 관련 예외");
		}catch(Exception e ) {
			System.out.println("예외발생");
		}
	}// 상황마다 다르게 처리하는 로직이 예외에 있어야 한다. 

}
