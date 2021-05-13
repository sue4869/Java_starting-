package day0501.thread.ex07;

public class CountUp implements Runnable{
	
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
