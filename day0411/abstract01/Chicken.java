package day0411.abstract01;

public class Chicken extends Animal{
	public Chicken(String name) {
		this.name = name;
	}
	
	@Override
	public void bark() {
		System.out.println(name + "은 꼬끼오");	
	}
	
	public boolean isFried() { // 메서드
		return false;
	}

}
