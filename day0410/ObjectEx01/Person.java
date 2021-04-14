package ObjectEx01;

public class Person { // Object를 기본적으로 상속받는 상태라 Object를 쓸 수 있다
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
		public String toString() {
			
			return "이름 :" + name+"나이 :" + age;
		}
}
