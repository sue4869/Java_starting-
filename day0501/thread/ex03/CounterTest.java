package day0501.thread.ex03;

public class CounterTest {
	//인터페이스 특징
	//부모타입의 객체를 만들어 자식타입의 자료형을 넣어줄 수 있다. 
	public static void main(String[] args) {
		Runnable countDown = new CountDown();//Runnable의 객체를 만들어 CountDown자료형을 넣어준다.
		Thread t1 = new Thread(countDown);//Thread안에 run이라는 객체를 넣어주면 그 객체를 새로운 쓰레드에서 호출한다
		t1.start();
		
		Thread t2  = new Thread(new CountUp()); //객체 자체를 만들면서 넣어줄 수도 있다.
		
		System.out.println(Thread.currentThread() + "종료");
	}

}

