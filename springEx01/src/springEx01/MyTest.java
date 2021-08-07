package springEx01;

import org.springframework.context.ApplicationContext;//이것이 Maven Dependecies에서 추가한것에서 가져온것
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyTest {

	public static void main(String[] args) {
		// 스프링 컨테이너를 만들고, 빈을 가져와서 출력해보자. 
		
		//스프링 설정정보가 있는 파일을 참고하여 스프링 컨테이터(객체)를 생성
		ApplicationContext ctx = new GenericXmlApplicationContext("springEx01/springContext.xml"); //()안에서는 설정파일의 위치를 넣어준다. 
		//빈을 설정했기에 springContext를 만들면서 빈의 person도 만들어진다. 컨테이너 속에 person이라는 객체가 만들어진것.
		
		System.out.println("스프링 컨테이너 생성");
		System.out.println(ctx);
		
		Person p = (Person)ctx.getBean("myPerson"); //bean의 id값을 넣어준것. bean의 타입 종류가 많기에 기본적으로 모든타입을 담을 수 있는 object로 반환되기에 다운캐스팅해야한다. 
		System.out.println(p);
		
	}

}
