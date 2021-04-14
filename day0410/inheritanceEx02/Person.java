package inheritanceEx02;

public class Person {
	String name;
	
	Person() {
		// 기본 생성자 만들어줌
	}
	
	Person(String name) {
		this.name = name;
	}
	
	//필드 name을 반환하는 메서드
	String getName() {
		return name;
	}
	
	// 필드 name에 값을 넣어주는 메서드 
	void setName(String name) {
		this.name = name;
	}
	
}
