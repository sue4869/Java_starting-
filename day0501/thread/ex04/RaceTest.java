package day0501.thread.ex04;

public class RaceTest {

	public static void main(String[] args) {
		Thread[] tArr = new Thread[5];
		for(int i=0; i < tArr.length; i++) {
			tArr[i] = new Horse(i + "번");
		}
		
		for(int i=0; i < tArr.length; i++) {
			tArr[i].start();
		}

	}

}
