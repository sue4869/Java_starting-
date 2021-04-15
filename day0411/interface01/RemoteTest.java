package day0411.interface01;

public class RemoteTest {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.turnOff();
		tv.turnOn();
		
		Aircon aircon = new Aircon();
		aircon.turnOff();
		aircon.turnOn();
		
		//인터페이스 --> 다형성 (부모가 같기에 부모로 객체들을 묶을 수 있음)
		// 직접적인 객체를 만들 수는 없지만 tv를 넣을 수 있다. 
		RemoteController rc = tv;
		rc.turnOff();
		rc.turnOn();

	}

}
