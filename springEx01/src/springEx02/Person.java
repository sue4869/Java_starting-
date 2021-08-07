package springEx02;

public class Person {
	private String name;
	private int age;
	private Phone phone;
	public Person(String name, int age, Phone phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public Person() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) { //외부로터 phone을 가져온것. spring이라는 컨테이너가 넣어준것. 
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	
	
}
