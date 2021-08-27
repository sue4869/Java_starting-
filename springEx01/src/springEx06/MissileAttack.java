package springEx06;

import org.springframework.stereotype.Component;

@Component
public class MissileAttack implements Attack {
	
	@Override
	public void Attack() {
		System.out.println("미사일 공격");
		
	}

}
