package day0403.classEx03;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person p1 = new Person(); // 객체화
		p1.car = new Car();
		p1.phone = new Phone();
		p1.shoes = new Shoes();
		
		// 사용자로부터 입력받자
		// 이름 입력받기
		System.out.println("사람이름");
		String name = sc.next();
		
		System.out.println("차이름은?");
		String carName = sc.next();
		
		System.out.println("차가격은?");
		int carPrice = sc.nextInt();
		
		p1.car.name = carName;
		p1.car.price = carPrice;
		
		System.out.println("폰 브랜드?");
		String phoneBrand = sc.next();
		
		System.out.println("폰가격은?");
		int phonePrice = sc.nextInt();
		
		p1.phone.brand = phoneBrand;
		p1.phone.price = phonePrice;
		
		System.out.println("신발 브랜드?");
		String shoesBrand = sc.next();
		
		System.out.println("신발가격은?");
		int shoesPrice = sc.nextInt();
		
		System.out.println("신발사이즈은?");
		int shoeSize = sc.nextInt();
		
		p1.shoes.brand = shoesBrand;
		p1.shoes.price = shoesPrice;
		p1.shoes.size = shoeSize;
		
		if("가렌".equals(p1.name)) {
			System.out.println(p1.name + "의 폰은"+p1.phone.brand);
		}
		

	}

}
