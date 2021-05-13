package day0501.thread.ex07;

public class CounterTest {

	public static void main(String[] args) {
		Runnable countDown = new CountDown();
		Thread t1 = new Thread(countDown);
		t1.setPriority(10);//우선순위 해주기
		
		Thread t2  = new Thread(new CountUp()); 
		t2.setPriority(1);
		
		t1.start();
		t2.start();
		
		System.out.println(Thread.currentThread() + "종료");
	}

}

