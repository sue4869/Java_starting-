package day0411.interface01;

public interface RemoteController { //class --> interface
	// 인터페이스는 모든 메서드를 추상메서드로 받기에 따로 abstract를 안써줘도 된다. 
	// 뭔가를 켜는 기능
	public void turnOn();
	
	// 뭔가를 끄는 기능
	public void turnOff();
}
