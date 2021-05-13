package day0501.thread.ex02;
//쓰레드로 만들자
public class CountUp extends Thread{
	// 새로운 쓰레드가 생성되어 일하는 부분은 run 메서드 안에 구현해야 한다. 
	// run() 메서드는 쓰레드 안에 있기에 오버라이드 가능
	
	@Override
	public void run() {
		printCountUp();
	}
	
	public void printCountUp() {
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+'s');
		}
	}
}
