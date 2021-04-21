package day0417.objectEx;

public class User {
	private int id; // 주민번호
	private String name;
	private int age;
	
	public User(int id,String name, int age) {
		super(); // object객체를 호출함
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
//	@Override
//	public String toString() {
//		String str = "";
//		str += "id : " +id;
//		str += ", name :" + name;
//		str += ", age :" + age;
//		return str;
//	}
	
	@Override // 이걸 안했기에 그냥 객체만 비교한것
	public boolean equals(Object obj) {
		// obj에게 id를 가지고 있지 않아서 다운캐스팅을 해야한다. 
		return (this.id == ((User)obj).id);
	}
}
