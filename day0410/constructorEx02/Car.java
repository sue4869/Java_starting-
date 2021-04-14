package constructorEx02;

public class Car {
	String name;
	int price;
	String color;
	
	
	
	public Car(String name, int price) {
		System.out.println("생성자 호출");
		this.name = name;
		if(price < 0) {
			this.price = 0;
		}else {
			this.price = price;
		}

		
	}
	public Car(String name, int price, String color) {
		
		this(name,price);//기존에 정의한 다른 생성자를 호출 // 반드시 맨 윗줄에 있어야 한다.
						 // 다른 클래스의 생성자는 호출 불가능
						 // this가 이름과 가격만 있는 생성자를 가르켜서 가져옴
		this.color = color;
	}
	public Car(String name) {
		this.name = name;
	}
	
	// 매개변수가 다르고 생성자의 이름이 같은것 : 생성자의 오버로딩
	
	
	
}