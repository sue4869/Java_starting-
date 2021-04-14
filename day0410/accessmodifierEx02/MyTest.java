package accessmodifierEx02;

import accessmodifierEx01.MyClass;

public class MyTest {

	public static void main(String[] args) {
		MyClass m = new MyClass(); // 다른 패키지의 클래스 쓸때는 import사용
		m.publicNum = 10 ; // public은 다른 패키지에서도 접근가능
//		m.protecteNum = 10; // 같은 패키지 또는 다른 패키지에서 상속받았을때 접근 가능
//		m.defaultNum = 10; // 같은 패키지에서만 접근가능
		
		m.publicMethod();
//		m.protectedMethod();
//		m.defaultMethod();
	}

}
