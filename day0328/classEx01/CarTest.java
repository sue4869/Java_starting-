package day0328.classEx01;

public class CarTest {

	public static void main(String[] args) {
		// Car 라는 객체 두개를 만들자
		// Car의 인스턴스 : 인스턴스는 자료형을 표현해야 해서 ~의 인스턴스라고 말한다. 
		
		Car c1 = new Car(); //new Car()는 Car의 인스턴스 --> 객체 Car 
		c1.name = "아이오닉5";	// new로 객체 개수 알수 있다 //Ask
		c1.color = "파랑";
		
		Car c2 = new Car();
		c2.name = "모닝";
		c2.color = "빨강";
		
		Car c3; // 여기까지 지금도 객체 2개임. 이줄은 그냥 변수를 만든것뿐
		c3 = c2; // 복사 // 여기까지도 객체 2개 //c3는 c2의 객체를 가르키는 것뿐 // 참조변수라서
		c3.color = "검정";
		
		System.out.println(c2.color); // 검정
		System.out.println(c3.color); // 검정
		
		//객체는 언제 소멸하는 가?
		//gc(갈비지컬랙터)라는 아이가 삭제 해준다. 언제?
		// 객체가 연결된 아이가 하나도 없을때!
		
		// 연결끊기
		c1 = null; // 객체는 1개가 남게된다. 
		c2 = null; // 그래도 객체는 1개, c3가 아직 남았으니
	}

}
