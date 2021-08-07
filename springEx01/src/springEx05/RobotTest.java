package springEx05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class RobotTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("springEx05/springContext.xml");
		
		TaekwonV taekwonV = ctx.getBean(TaekwonV.class);
		taekwonV.fight();
		
		Transformer transformer = ctx.getBean(Transformer.class);
		transformer.fight();
		

	}

}
