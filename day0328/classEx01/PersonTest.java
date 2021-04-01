package day0328.classEx01;

public class PersonTest {

	public static void main(String[] args) { // 자바는 항상 main부터 실행한다
		// Person이라는 클래스로 객체를 만들어보자
		// 객체를 만드는 키워드? new
		
		// 클래스명 변수명; ( 변수의 선언 )
		// 변수 = new 클래스명(); --> 객체 생성과 대입
		// 클래스 : 사용자 정의 자료형 --> 클래스도 하나의 자료형이다
		
		Person person1 = new Person(); // 비어있는 객체
      // 자료형      변수명       ( 변수의 선언 ) 
	  // 자료형 : 첫글자가 대문자 --> 클래스임을 알수 있다. String도 클래스. int는 아님
		
		/*
		 * 하나의 값을 담기 위해서는 변수가 필요하다
		 * 같은 자료형의 데이터를 여러개 담기 위해서는 배열이 필요하다
		 * 서로 다른 자료형의 데이터들을 담기 위해서는 클래스가 필요하다. 
		 */
		
		// 객체에 있는 필드에 값을 넣는 방법
		// . 를 이용한다 
		// 변수명. 필드명 
		//데이터 : 정보들 --> 상태, 필드, 속성, 멤버변수라고 한다.
		person1.name = "홍길동";
		person1.age = 40;
		person1.money = 200000;
		
		// 메서드 호출 : 변수명.메서드명();
		person1.introduce();
		System.out.println("************");
		// Person 클래스를 이용하여 객체 두개를 더 만들고 값을 넣어보세요
		Person person2 = new Person();
		Person person3 = new Person();
		
		person2.name = "유수민";
		person2.age = 26;
		person2.money = 1000000;
		person2.introduce();
		System.out.println("*****************");
		
		person3.name = "유선준";
		person3.age = 30;
		person3.money = 2000000;
		person3.introduce();
		System.out.println("****************");
		
		//데이터 출력
		System.out.println("person2의 이름은" + person2.name);
		System.out.println("person3의 이름과 나이는 ,"+person3.name+","+person3.age);
		
		//홍길동의 나이를 70으로 바꾸고, 
		//돈을 20역으로 변경하여
		//출력하세요
		
		person1.age = 70;
		person1.money = 2000000;
		System.out.println("나이는"+person1.age+", 돈은"+ person1.money);
		
		// Student라는 클래스를 만들고
		// name, age, kor(국어성적), eng(영어성적), math(수학성적)을 담을 수 있는 필드를 만들고
		//StudentTest 클래스에 main메서드를 만들어
		//학생 5명의 정보를 담고, 출력해보세요
		
	}

}
