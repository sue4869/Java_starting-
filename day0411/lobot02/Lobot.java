package day0411.lobot02;

public abstract class Lobot {
	String name;
	// 각각의 로봇의 기능이 다르기 때문에 내용을 구현하지 않고
	// 추상메서드로만 만든다. 
	
	public final void fight() {
		System.out.println(name+ "가 전투를 시작합니다");
		attack();
		move();
		attack();
		System.out.println(name + "가 전투를 종료합니다");
		
	}

	public abstract void attack();
	public abstract void move();
	
}

// 유저 인터페이스 : 사용자가 control할 수 있는 기능을 수행할 수 있는 버튼이나 기능을 제공하는 것
// 인터페이스 : 서로 다른 두개의 시스템 사이에 정보나 신호를 주고받는 경우의 접점 (여기서는 버튼)
// 인터페이스를 구현하는 아이 +  인터페이스를 이용하는 하이
// api : application programming interface
// 자바 api ex) String Math ==> 자바 라이브러리 : 자바의 api를 묶어놓은 것. 
// 자바 api는 클래스로 만들어진다

// 인터페이스는 기본적으로 추상메서드로만 이루어진다. 
// 추상클래스는 상속받는것(기능 물려줌): abstract :extends
// 인터페이스는 기능의 강제화(인터페이스를 받으면 반드시 쓰여야 한다) : interface : implements
