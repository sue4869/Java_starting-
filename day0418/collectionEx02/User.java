package day0418.collectionEx02;

public class User {
	String name;
	int age;
	

	public User(String name, int age) { //필드를 사용하는 생성자 
		super();
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name= name;
	}

	public String getName( ) {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
