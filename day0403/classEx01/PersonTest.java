package day0403.classEx01;

public class PersonTest {

	public static void main(String[] args) {
		Person sue = new Person(); // 변수 sue는 Person 자료형의 선언을 하여 객체를 만들었다
		
		// 사람 객체 안에는 이름과 money가 존재하는데
		sue.name = "유수민";
		sue.money = new Money(); // money도 따로 객체를 만들어줘야 한다. 
		
		sue.money.danwi = "달러";
		sue.money.amount = 4;
		
		Person s = new Person();
		s.money = sue.money; // Ask

	}

}
