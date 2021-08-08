package springEx02.ex01;

public class MyAspect {
	//핵심기능이 수행되기 전에 수행할 아이
	public void beforeDoSomething() {
		System.out.println("집에 문을 열고 들어간다");
	}
	
	//핵심 기능이 수행된 후 수행할 아이
	public void afterDoSomething() {
		System.out.println("문을 닫고 집을 나온다.");
	}
	
	//핵심기능이 리턴을 한 후 수행할 아이!
	//String msg를 넣어줌으러써 리턴이 잘 발행하는 지 알 수 있다 version 2
	public void afterReturn(String msg) {
		System.out.println("msg의 값:" + msg);
		System.out.println("리턴이 끝나고");
	}
	
	//핵심기능이 예외가 발생했을때 
	
	public void afterThrowing(Throwable th) {
//		th.printStackTrace();
		System.out.println("예외발생");
		
	}
}
