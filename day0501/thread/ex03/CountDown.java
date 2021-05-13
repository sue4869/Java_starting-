package day0501.thread.ex03;

public class CountDown extends Thread{

	
	@Override
	public void run() {
		printCountDown();
	}
	
	public void printCountDown() {
		for(int i=10; i>0; i--) {
			try {
				sleep(1000); 
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+'s');
		}
	}
}
