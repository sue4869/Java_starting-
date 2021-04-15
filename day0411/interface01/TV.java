package day0411.interface01;

public class TV implements RemoteController{
	
	@Override
	public void turnOff() {
		System.out.println("티비 끕니다");
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("티비 킵니다");
		
	}

}
