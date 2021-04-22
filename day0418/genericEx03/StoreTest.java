package day0418.genericEx03;

public class StoreTest {

	public static void main(String[] args) {
		Car car = new Car();
		car.name = "현대";
		
		//<>안에 넣고자 하는 타입을 넣어준다.
		Store<Car> store = new Store<>();
		
		store.setData(car);
		Car car2 = store.getData(); //형변환을 안해도 알아서 car타입으로 바꿔진다
		System.out.println(car2.name);
		car2.go();
		
		String str = "사과";
		//store.setData(str); //Car만 저장되도록 했기 때문에 다른 타입은 사용이 안됨. 

	}

}
