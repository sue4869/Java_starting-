package inheritanceEx03;

public class Person {
	String name;
	
	// 무조건 필드값을 받도록 유도하기 위해 기본생성자를 안써줄 수 있다. 
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
	
	void printInfo() {
		
	}
	
}
