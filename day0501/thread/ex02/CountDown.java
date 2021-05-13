package day0501.thread.ex02;
//쓰레드로 만들자
public class CountDown extends Thread{
	// 새로운 쓰레드가 생성되어 일하는 부분은 run 메서드 안에 구현해야 한다. 
	// run() 메서드는 쓰레드 안에 있기에 오버라이드 가능
	
	@Override
	public void run() {
		printCountDown();
	}
	
	public void printCountDown() {
		for(int i=10; i>0; i--) {
			try {
				//Thread.sleep(1000);
				sleep(1000); //CountDown이 쓰레드를 상속받았기에 앞에 쓰레드를 명시안해도 된다.
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+'s');
		}
	}
}
