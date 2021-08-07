package springEx06;

import org.springframework.stereotype.Component;

@Component
public class PunchAttack implements Attack{

	@Override
	public void Attack() {
		System.out.println("TTTTTT");
	}
}
