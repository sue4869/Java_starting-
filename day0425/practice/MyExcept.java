package day0425.practice;

import java.io.IOException;

//3
	//클래스 MyExcept를 생성
	// makeException()이라는 메서드에서 파라미터로 숫자를 받고
	//사용자로부터 숫자 1~4까지의 값을 받도록 만들고
	// 1번이면 캐스트예외
	// 2번이면 널포인터예외
	// 3번이면 아이오 예외
	// 4번이면 아리스매틱 예외
	// 를 발생시키도록 규현
	// MyExceptionTest 클래스에서
	// 사용자로부터 숫자를 입력받아 makeException메서드를 사용하시오. 

public class MyExcept {

		
		public int makeException(int num) throws IOException,ClassCastException,NullPointerException,ArithmeticException{
			// 위에처럼 다 써줌으로써 메서드를 쓰는 쪽에서 exception 발생에 대한 준비를 할 쑤있게 (catch-try) 한다. 
			switch(num) {
			case 1 :
				throw new ClassCastException();
			case 2 :
				throw new NullPointerException("널널");
			case 3 :
				throw new IOException();
			case 4 :
				throw new ArithmeticException();
			default:
				// 예외발생없이 정상적으로 작동할때만 return
				//자바는 return을 한번만 보내주는데, 때로는 어떤 상황인지도 알려줘야 할때가 있다. 
				return 0;
			}
		}

	

}
