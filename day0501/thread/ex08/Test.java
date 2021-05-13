package day0501.thread.ex08;

public class Test {

	public static void main(String[] args) {
		Count c = new Count();
		c.setDaemon(true);
		c.start();
		try {
			Thread.sleep(50000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
//원래 쓰래드는 main이 종료되어도 계속 돌고 있어야 하는데
//데몬 쓰레드는 main이 종료되면 강제종료되는 것. 
