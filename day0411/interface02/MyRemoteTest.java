package day0411.interface02;

public class MyRemoteTest {

	public static void main(String[] args) {
		
		MyRemote myRemote = new MyRemote();
		TV tv = new TV();// 티비를 키기 위한 티비객체를 만들어 준다 
		// myRemote와 tv를 연결하는 것이 remoteController이다 
		// 인터페이스는 상속과 달리 다중상속할 수 잇다
		
		myRemote.setRemoteCOntroller(tv);
		
		myRemote.on();
		myRemote.off();

	}

}
