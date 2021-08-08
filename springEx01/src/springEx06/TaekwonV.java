package springEx06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;
//
@Component("taekwonV") //어노테이션을 해줘서 컨텍스트 스캔으로 스캔되어 빈으로 등록할 수 있도록 한다 //아이디값을 직접 정의할 수 있다. 
//컨포턴트에 의해 객체로 만들려고 한다. 
public class TaekwonV {
	private Attack attack;
	private String name;
	
	//autowired를 하려면 반드시 빈으로 등록되어있는 객체여야 한다. 
	//빈으로 만들어진 객체를 주입받도록 한다. 
	@Autowired //객체가 값이 들어갈 수 있게 한다. 
//	@Qualifier("punchAttack")//특정 객체를 아이디로 지정할 수 있음
	public TaekwonV(@Qualifier("punchAttack") Attack attack,@Value("태권") String name) {
		this.attack = attack;
		this.name = name;
	}
	
	public void fight() {
		System.out.println(name+"이");
		attack.Attack();
	}
	
	//setter가 없기 때문에 이 상태로는 propery사용할 수 없음
}
