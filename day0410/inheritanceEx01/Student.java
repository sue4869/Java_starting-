package inheritanceEx01;

// 상속은 extends라는 키워드 사용 // 서브클래스, child클래스
//구현하지 않아도 상속받은 클래스의 필드와 메서드 사용가능
//  class 클래스명 extends 부모클래스명{ }
public class Student extends Person{
	String name;
	int kor;
	int eng;
	int math;
	
	// Person 에 있는 name관련 코드들은 상속받기

}
