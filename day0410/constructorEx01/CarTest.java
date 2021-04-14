package constructorEx01;

public class CarTest {
	public static void main(String[] args) {
		// 기본 생성자는
		// 내가 다른 생성자를 정의하면
		// 자동으로 만들어 주지 않는다.
		// 생성자는 객체를 만들어줄때 만들어진다.
		// Car car = new Car(); // 이것은 매개변수를 받지 않는 기본 생성자가 필요한데
								// 현재 Car 클래스에는 매개변수를 받는 생성자만 존재한다
								// 따라서 기본 생성자는 따로 적어줘야 한다.
		// new Car() -> 생성자 호출
		Car car = new Car();
		car.name = "소나타";
		car.price = 10000;
		car.printInfo();
		
		Car car1 = new Car("소나타",100);
		System.out.println(car1.name);
	}
}
