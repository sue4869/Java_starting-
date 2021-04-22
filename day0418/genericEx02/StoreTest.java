package day0418.genericEx02;

public class StoreTest {

	public static void main(String[] args) {
		StoreObject store = new StoreObject();
		store.setData("사과");
		
		System.out.println(store.getData());
		
		// 그러나 Object는 모든 클래스의 부모이나, 모든 타입의 부모는 아니다
		StoreObject store2 = new StoreObject();
		store2.setData(10);
		//int는 클래스 타입이 아닌데 Object로 들어갈 수 있는 이유 : 오토랩핑
		//오토랩핑 ==> 각각 타입의 클래스가 있다. integer.Double. Long,Char ==> 래퍼클래스
		// 오토랩핑으로 int는 integer의 객체로 바뀐다. integer는 Object를 상속받는 거이니 들어갈 수있게 되는 것
		//integer은 Object의 자식이니 변수로 들어갈수 있다
		
		System.out.println(store2.getData());
		
		//래퍼클래스와 기본타입의 대입
		Integer num = 10;
		int num01 = new Integer(20);
		
		System.out.println("*****************");
		
		// car를 저장해보자
		StoreObject store03 = new StoreObject();
		
		Car car = new Car();// 데이터를 넣기
		car.name = "현대";
		
		store03.setData(car);
		
		//getData로 하면 Object타입이 된 상태라 자식 타입으로 바꿔줘야 한다. 다운캐스팅
		Car car01 = (Car)(store03.getData());//그러나 지금은 타입이 car인것을 알때 상황
		
		
		

	}

}
