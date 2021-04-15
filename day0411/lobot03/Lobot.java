package day0411.lobot03;

public abstract class Lobot {
	String name;
	Attackable attack;
	Moveable move;
	
	public final void fight() {
		System.out.println(name+ "가 전투를 시작합니다");
		attack();
		move();
		attack();
		System.out.println(name + "가 전투를 종료합니다");
		
	}

	public void attack() {
		attack.attack();
	}
	public void move() {
		move.move();
	}
	
}
