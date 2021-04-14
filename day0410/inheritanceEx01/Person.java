package inheritanceEx01;

//부모를 의미 --> super클래스, parent 클래스, base 클래스
public class Person {
	String name;
	
	// 필드 name을 반환하는 메서드
	String getName() {
		return name;
	}
	// 필드 name에 값을 넣어주는 메서드
	void setName(String name) {
		this.name = name;
	}
}
