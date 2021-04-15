package day0411.interface02;

public class Aircon implements RemoteController{ 
	
	 
	@Override
	public void turnOff() {
		System.out.println("에어컨 끕니다");
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("에어컨 킵니다");
			
		}
}
