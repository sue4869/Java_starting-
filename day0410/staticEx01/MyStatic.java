package staticEx01;

public class MyStatic {
// Static : 클래스 메모리에 존재(처음 자바 실행시 존재), static은 메서드로도 만들수 있다
	public static int staticNum;
	
	// nonstatic
	public int num; // 객체가 생겨야 생김
	
	public static void staticPrintNum() { // 객체 없어도 됨
		//System.out.println(num); // static은 처음 자바 실행시부터 존재. 
								   //num은 인스턴스변수라 객체가 생성되면 생김
		System.out.println(staticNum);
	}
	
	public void printNum() {
		System.out.println(num);
		System.out.println(staticNum);
	}
	
	// 우리가 만드는 모든 클래스는 object라는 클래스를 상속받았음
	// object의 메서드와 변수를 쓸수 있다. 
}
