package day0411.interface02;

public class MyRemote {
	RemoteController rc; // 멤버변수로 remoteController를 받는다. 
	
	void setRemoteCOntroller(RemoteController rc) {
		this.rc = rc;
	} // 단순한 메서드인것같지????
	
	public void on() {
		rc.turnOn();
	}
	
	public void off() {
		rc.turnOff();
	}
}
