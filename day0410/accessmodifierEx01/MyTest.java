package accessmodifierEx01;

public class MyTest {

	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.publicNum = 10;
		m.protectedNum = 10;
		m.defaultNum = 10;
	  //m.privateNum = 10;  // private은 해당 클래스 안에서만 접근이 가능
		
		m.protectedMethod();
		m.protectedMethod();
		m.defaultMethod();
	  //m.privateMethod() // 메서드도 해당 클래스 내부에서만 사용가능한 변수
		
		System.out.println(m.publicMethod());
		// private은 직접 접근만 불가능한것이지, 다른 메서드를 통해서는 접근 가능
		//publicMethod() 여기 속에 privatNum 존재
	}

}
