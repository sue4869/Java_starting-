package day0403.classEx02;
//프로젝트를 새로만들어서
//Car 클래스 :이름, 가격
//Phone 클래스 : 이름, 브랜드, 가격
//Shoes 클래스 : 브랜드, 사이즈, 가격
//Person 클래스 :이름, car, phone, shoes
//PersonTest를 만들어
//두 명의 Person 객체를 만들고, 각각 차, 폰, 신발의 객체를 만들어 넣은 후 출력!! 

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "가렌";
		p1.car = new Car();
		p1.car.name = "아이오닉5";
		p1.car.price = 50000000;
		p1.phone = new Phone();
		p1.phone.brand = "삼성";
		p1.phone.price = 2000000;
		p1.shoes = new Shoes();
		p1.shoes.brand = "나이키";
		p1.shoes.size = 260;
		p1.shoes.price = 100000;
		
		Person p2 = new Person();
		p2.name = "럭스";
		p2.car = new Car();
		p2.car.name = "소나타";
		p2.car.price = 20000000;
		p2.phone = new Phone();
		p2.phone.brand = "애플";
		p2.phone.price = 3000000;
		p2.shoes = new Shoes();
		p2.shoes.brand = "아디다스";
		p2.shoes.size = 270;
		p2.shoes.price = 150000;
		
		System.out.println("이름 :"+p1.name);
		System.out.println("차 :"+p1.car.name+", 가격:"+p1.car.price);
		System.out.println("폰 :"+p1.phone.brand+", 가격 : "+p1.phone.price);
		System.out.println("신발 : "+p1.shoes.brand+", 사이즈: "+p1.shoes.size+", 가격 : "+p1.shoes.price);
		
		System.out.println("이름 :"+p2.name);
		System.out.println("차 :"+p2.car.name+", 가격:"+p2.car.price);
		System.out.println("폰 :"+p2.phone.brand+", 가격 : "+p2.phone.price);
		System.out.println("신발 : "+p2.shoes.brand+", 사이즈: "+p2.shoes.size+", 가격 : "+p2.shoes.price);

	}

}
