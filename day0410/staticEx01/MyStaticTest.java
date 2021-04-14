package staticEx01;

public class MyStaticTest {

	public static void main(String[] args) {
		//static으로 된 아이는 객체가 없어도 사용가능하다
		// (클래스명.스태틱 변수) 또는 (클래스명.스태틱 메서드)
		MyStatic.staticNum = 10;
		MyStatic.staticPrintNum();
		System.out.println("MyStatic.staticNum" + MyStatic.staticNum);// 10 출력
		
		MyStatic m = new MyStatic();
		m.num = 20;
		m.staticNum = 20;//경고 :The static field MyStatic.staticNum sh : 객체가 아니라 static변수를 공유한것이니 주의해라
		System.out.println("m.num" + m.num);
		System.out.println("m.staticNum" + m.staticNum);
		m.staticPrintNum();
		m.printNum();
		
		System.out.println("MyStatic.staticNum" + MyStatic.staticNum);//20 출력
		
		MyStatic m2 = new MyStatic();
		System.out.println("MyStatic.staticNum" + MyStatic.staticNum);
		
		Math.random(); // static으로 만들어져 있다
		System.out.println(Math.PI);
		// PI --> final 변수의 예 : 더이상 변하지 않는 수를 상수라 하는데, 이 아이를 표현할때는 대문자로 쓴다
		// final : 더이상 변하지 못하도록 막음. 마지막이라는 의미. 변수는 다른 값으로 계쏙 넣어줄 수 있지만, final로 쓰면 다른 값으로 바꿔줄 수 없음
		// 메서드에도 final 쓸 수 있는데 메서드의 오버라이딩을 막음
	}

}
