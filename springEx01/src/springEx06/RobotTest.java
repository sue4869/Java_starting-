package springEx06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RobotTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("springEx06/springContext.xml");
		
		PunchAttack p = ctx.getBean("punchAttack",PunchAttack.class);
		p.Attack();

	}

}
