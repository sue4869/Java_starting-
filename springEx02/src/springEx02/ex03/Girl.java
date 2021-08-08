package springEx02.ex03;

import org.springframework.stereotype.Component;

@Component
public class Girl {
	public String doSomething() {
		//공통이 있지만 따로 관리. 순서는 일정
//		System.out.println("집에 문을 열고 들어간다"); //공통기능(cross-cutting)
		System.out.println("집에서 티비를 본다.");//핵심
//		System.out.println("집에 문을 닫고 집에 나온다"); //공통기능
		
		return "I am a girl";
	}
}