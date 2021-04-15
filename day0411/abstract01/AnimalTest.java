package day0411.abstract01;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal; //클래스선언
		//animal = new Animal();// 추상클래스는 객체로 만들 수 없다. 
		                        // 따로 메서드 구현 해줘야 한다 --> Lion
		
		Lion lion = new Lion("사자");
		lion.bark();
		lion.hunt();
		
		Dog dog = new Dog("강아지");
		dog.bark();
		
		Chicken chicken = new Chicken("닭");
		chicken.bark();
		System.out.println("후라이 됨?");
		chicken.isFried();
		
		// 위 세개가 부모가 같기에 부모로 객체들을 묶을 수 있음
		// 다형성! polymorphism --> Animal이 다른 자료형들을 포함시키는것
		//                    --> 반드시 상속된 자료형들이어야 함
		Animal[] animalArray = new Animal[3];
		animalArray[0] = lion;
		animalArray[1] = dog;
		animalArray[2] = chicken;
		
		for(int i=0; i < animalArray.length; i++) {
			animalArray[i].bark();
		}
		// 사자에 있는 hunt(), chicken에 있는 isFried()는 부모에 없음
		// 따라서 부모 자료형으로는 사용이 안됨// animalArray[i].hunt(); 할수 없음
		// 자식 자료형으로 변경해서 써야함 --> 다운캐스팅을 해서 씀
		Lion li = (Lion)(animalArray[0]); 
		li.hunt();
		
		Chicken c1 = (Chicken)(animalArray[2]);
		System.out.println("후라이됨" + c1.isFried());
		
		//변수 안에 들어있는 인스턴스가 실제로 어떤 자료형인지 확인하는 방법
		if(animalArray[1] instanceof Lion) {
			Lion l2 = (Lion)(animalArray[1]);
			l2.bark();
		}
		else if(animalArray[1] instanceof Chicken) {
			Chicken c2 =  (Chicken)(animalArray[1]);
			c2.bark();
		}else if(animalArray[1] instanceof Dog) {
			Dog d2 =  (Dog)(animalArray[1]);
			d2.bark();
		}
	}

}
