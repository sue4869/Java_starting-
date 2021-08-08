package springEx02.ex03;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Before(value = "execution(public String *.doSomething())")
	public void beforeDoSomething() {
		System.out.println("집에 문을 열고 들어간다");
	}
	
	//핵심 기능이 수행된 후 수행할 아이
	@AfterReturning(value="execution(public Sting *.doSomething()", returning = "msg")
	public void afterDoSomething() {
		System.out.println("문을 닫고 집을 나온다.");
	}
	
	//aop표현식 검색 해서 다른것도 적용해보기.
}
