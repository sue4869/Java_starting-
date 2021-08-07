package springEx03;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new GenericXmlApplicationContext("springEx03/springContext.xml");
		
		Person p = ctx.getBean("myPerson", Person.class);//다운캐스팅을 안해도 된다. 
		//여기서 name과 age말고도 phone도 자동으로 갖게 하려면 설정파일에 적어둬야 하는데 기본 자료형이 아니기때문에 따로 만들어줘야 하낟. 
		System.out.println(p);
		
		List<String> foods = p.getFavoriteFoods();
		for(String string : foods) {
			System.out.println(string);		}
		
		Phone phone = ctx.getBean("phone",Phone.class);
		System.out.println(phone);
		
		//근데 이렇게 따로 만드는 것이 아니라 person을 불렀을때 자동으로 phone이 들어가는 것이기에 따로 설정해야 한다. --verson2로 지칭
	}

}
