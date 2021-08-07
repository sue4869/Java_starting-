package springEx05;

public class TaekwonV {
	private Attack attack;
	private String name;
	
	public TaekwonV(Attack attack, String name) {
		this.attack = attack;
		this.name = name;
	}
	
	public void fight() {
		System.out.println(name+"이");
		attack.Attack();
	}
	
	//setter가 없기 때문에 이 상태로는 propery사용할 수 없음
}
