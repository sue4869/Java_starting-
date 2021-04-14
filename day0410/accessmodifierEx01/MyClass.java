package accessmodifierEx01;

// 외부접근을 어디까지 허용할 것인가?
// 같은 클래스 인가? 다른 패키지 인가? 같은 패키지 인가?
// public > protected > default(아무것도 명시안함) > private
public class MyClass {
	public int publicNum;
	protected int protectedNum;
	int defaultNum;
	private int privateNum;
	
	public int publicMethod() {
		return privateNum;
	}
	
	protected int protectedMethod() {
		return privateNum;
	}
	
	int defaultMethod() {
		return privateNum;
	}
	
	private int privateMethod() {
		return privateNum;
	}
	
}
