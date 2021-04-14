package inheritanceEx03;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("아버지");
		p.printInfo();
		
		Student s = new Student("유수민");
		s.eng = 100;
		s.printInfo();

	}

}

// 단일 상속만 허용한다. 부모가 2명이면 안된다
// 자식들은 서로 관계가 없다가 공통의 부모가 생겨 연관관계가 생긴다
// 부모로 묶을 수 있다. 
// 부모의 일부 기능을 자식이 접근할 수 없게 하는 것 : 접근제한자. 