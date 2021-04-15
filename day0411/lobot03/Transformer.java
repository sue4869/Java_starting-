package day0411.lobot03;

public class Transformer extends Lobot {
	
	
	public Transformer() {
		name = "트랜스포머";
		attack = new MissileAttack();
		move = new WalkingMove();
	}
}
