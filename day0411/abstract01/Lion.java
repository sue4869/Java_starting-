package day0411.abstract01;
//추상클래스를 상속받은 아이는 반드시 추상메서드를 override(부모의 메서드 재정의)해야함

public class Lion extends Animal {
	public Lion(String name) { // 생성자
		this.name = name; // Animal에서 상속받았기 때문에  name을 쓸 수 있다. 
	}
	
	@Override
	public void bark() {
		System.out.println(name+"사자는 야옹야옹");
		
	}
	
	public void hunt() { // 메서드 
		System.out.println(name + "가 사냥을 합니다");
	}

}
