package springEx06;

//import org.springframework.stereotype.Component;
//
//@Component //어노테이션을 해줘서 컨텍스트 스캔으로 스캔되어 빈으로 등록할 수 있도록 한다
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
