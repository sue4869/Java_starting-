package day0501.thread.ex04;

public class Horse extends Thread {
	private String name;
	
	public Horse(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + "말이 출발했습니다");
		int t = (int)(Math.random()*9+2); //2~10초 사이에 2초에 시작
		try {
			sleep(t*1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+"말이 도착했습니다.");
	}
}
