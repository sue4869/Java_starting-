package constructorEx02;

public class CarTest {
	public static void main(String[] args) {
		
		Car car1 = new Car("소나타",100);
		Car car2 = new Car("벤츠"); // 이름만 받는 생성자가 필요
		Car car3 = new Car("k5",3000,"검정");
		System.out.println(car3.color);
	}
}
