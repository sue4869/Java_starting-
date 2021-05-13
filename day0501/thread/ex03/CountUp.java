package day0501.thread.ex03;
// Runnable c = new
//틴터페이스의 특징 : 부모타입의 객체를 만들어 자식타입의 자료형을 넣어줄수 있다. 
public class CountUp implements Runnable{
	
	@Override 
	public void run() { //Runnable안에 정의된 메서드
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
