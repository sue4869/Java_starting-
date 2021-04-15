package day0411.interface01;

public class Aircon implements RemoteController{ //extends --> implements 
	
	// 추상메서드와 달리 각각 메서드를 만들어줘야 한다. override해줘야 한다. 
	@Override
	public void turnOff() {
		System.out.println("에어컨 끕니다");
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("에어컨 킵니다");
			
		}
}
