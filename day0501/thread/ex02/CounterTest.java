package day0501.thread.ex02;

public class CounterTest {

	public static void main(String[] args) {
		CountDown countDown = new CountDown();
		CountUp countUp = new CountUp();
		
//		countDown.run();//run 메서드만을 호출한다고 쓰레드 활용하는 것은 아님
		countDown.start(); //이것에 의해 새로운 쓰레드를 만들어서 이 쓰레드에서 run()메서드를 호출해 실행하게 됨
		countUp.start();
		
		System.out.println("종료");
	}
	//클래스를 나눈다고 해서 따로 실행을 각자 하지는 않는다. ==> 단일 쓰레드임. 순서대로 진해
	// 별개의 메인이 들어있는 아이가 2개 : main, Cdown쓰레드. Cup쓰레드

}

