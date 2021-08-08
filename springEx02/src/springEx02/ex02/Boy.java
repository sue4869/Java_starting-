package springEx02.ex02;

public class Boy {
	public String doSomething() {
//		System.out.println("집에 문을 열고 들어간다"); //공통기능
		System.out.println("집에서 게임을 한다. ");;//핵심
//		System.out.println("집에 문을 닫고 집에 나온다"); //공통기능
		
		//예외발생시키기
//		int a = (int)(Math.random()*2); //0과 1만 랜덤화
//		System.out.println(100/a);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
		return "I am a boy";
	}
}
