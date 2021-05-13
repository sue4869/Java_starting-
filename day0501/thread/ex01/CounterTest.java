package day0501.thread.ex01;

public class CounterTest {

	public static void main(String[] args) {
		//1~10까지 1초마다 출력하는 코드 
		for(int i=1; i<=10; i++ ) {
			try { //억지로 쉬게 하는 것이기에 try-catch가 필요
				Thread.sleep(1000);//1초마다 쉰다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+'s');
		}
		
		for(int i=10; i > 0; i--) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"초");
		}
		System.out.println("종료");

	}

}
//단일 쓰레드이기에 위에 쓰레드가 다 끝나야 밑에 쓰레드가 작동되는 것이다. 
