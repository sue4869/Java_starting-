package springEx06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //스프링 등록하기 
public class Gundam {
	@Value("건담")
	private String name;
	
	@Autowired
	@Qualifier("punchAttack")
	private Attack attack;
	
	
	public void fight() {
		System.out.println(name+"이 ");
		attack.Attack();
	}
}
