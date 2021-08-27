package springEx06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Transformer {
	private Attack attack;
	private String name;
	
	public Transformer() { //여기서 만든 객체를 setAttack에 주입된다. 
		
	}
	
	@Autowired //연결하는 개념
	@Qualifier("missileAttack") //연결된것들중 선택하는 개념
	public void setAttack(Attack attack) {
		this.attack = attack;
	}
	
	@Value("트랜스포머") //매써드 자체가 id한개 받아서 밖에 
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void fight() {
		System.out.println(name+"이");
		attack.Attack();
	}
}
