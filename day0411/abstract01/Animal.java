package day0411.abstract01;
//추상클래스
// "추상" 구체화되지 못하는 아이!
// 객체로 만들 수 없는 아이
// 추상 메서드를 갖고 있는 아이
// 필드와 메서드를 다 가질 수 있다

public abstract class Animal {
	String name;
	
	// 동물이 어떻게 짖을지 알수 없음
	//따라서 몸통(실행할 내용을 정의할 수 없음) --> 따로 메서드를 만들어줘야한다
	// {} 안을 몸통이라고 한다 
	
	public abstract void bark();
}
