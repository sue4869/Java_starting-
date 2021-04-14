package constructorEx01;

public class Car {
// 생성자
// 객체를 생성할 때 가장 먼저 호출하는 아이
// 형식 : 클래스명(매개변수) {
//          실행할 문장
//      }
	
	// 메서드와 비슷하나 생성자는 반환타입이 있고, 클래스 명과 반드시 같아야한다.
	// 생성자는 언제 쓸까? 객체를 초기화하는 용도로 사용한다. 
	// 기본 생성자(매개변수가 생략된) 는 직접 만들지 않아도 컴파일시 자동으로 생성해준다. => 내부 삽입되어 생략됨
	
	public Car() {
		System.out.println("카 생성자 호출");
	}
	// 객체를 생성시에 필드에 데이터를 초기화 할때
	// 매개변수를 받는 생성자를 호출하여 초기화 할 수 있다. 
	
	String name;// 필드 2개를 만든 상태
	int price;
	
	public Car(String name, int p) {
		// name과 price를 초기에 넣을 수 있다 
		// 필드에 파라미터로 넘어온 값을 대입한다.
		
		this.name = name;
		price = p;
		// this : 객체 자신을 의미 또는 필드를 의미한다고 생각해도 된다. 
		// 컴퓨터가 파라미터로 받은 변수와 필드랑 헷갈려하니 this를 써주는 것. 
	}
	void printInfo() {
		System.out.println(name+","+price);
	
	}
	
	
	
	
}