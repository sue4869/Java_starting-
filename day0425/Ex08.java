package day0425;

public class Ex08 {

	public static void main(String[] args) {
		//예외 객체를 직접 발생시키기 ==> throw
		//System.out.println(10/0); ==> 오류 종류: ArithmeticException
		
		throw new ArithmeticException(); //하나의 메서드라 객체 생성가능
		//throwable을 상속받은 클래스만 throw로 던져줄 수 있다. 

	}

}

