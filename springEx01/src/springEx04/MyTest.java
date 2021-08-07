package springEx04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("springEx04/springContext.xml");
		
		Student s = ctx.getBean("myStudent", Student.class);
		System.out.println(s);

	}

}
