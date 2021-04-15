package day0411.lobot03;

public class LobotTest {
	public static void main(String[] args) {
		
	TaekwonV taekwonV = new TaekwonV();
	taekwonV.fight();
	
	Transformer transformer = new Transformer();
	transformer.fight();
	
	Gundam gundam = new Gundam(new PunchAttack(), new FlyingMove());
	}
}
