package day0501.thread.ex08;

public class Count extends Thread {
	
	@Override //1초마다 하이를 만드는 쓰레드
	public void run() {
		while(true) {
			System.out.println("하이");
			try {
				sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
