package day0328.classEx01;

// 객체는 class를 이용하여 만든다. 
// class는? 설게도다 --> 설계도 만이라서 객체는 아직 안만들어진 상태
// 클래스는 객체를 만들기 위한 설계도이다

// 클래스 형식
// class 클래스명 {
//    '필드,매서드'
//   }

public class Person {
	
	// 필드 만들기 : 클래스 안쪽에 선언하는 변수들(데이터) --> 멤버변수, 속성, 필드
	String name;
	int age;
	int money;
	
	// 메서드 (동작)
	void introduce() {
		int num = 10; // 매서드 안에도 쓸수 있으나 멤버변수라고 할 수 없다
		System.out.println("나의 이름은"+name);
		System.out.println("내 나이는 :" + age);
		System.out.println("나는" + money + "원을 갖고 있음");
	}
}
