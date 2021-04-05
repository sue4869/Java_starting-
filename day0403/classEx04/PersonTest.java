package day0403.classEx04;

import java.util.Scanner;

// 여러사람에 대한 데이터 넣자 --> 배열 활용
public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 사람의 수를 넣으시오");
		int number = sc.nextInt(); 
		
		Person[] person = new Person[number];// 단지 배열만 만들어준것뿐
		//배열 : 같은 자료형의 묶음 == 변수들의 묶음
		//배열 선언만 해준것이라 객체가 없는 상태 = 빈공간
		//클래스도 하나의 자료형이기때문에 배열이 가능하다. 
		
		for(int i = 0; i < number; i++) {
			person[i] = new Person(); //Person p1 = new Person(); 변형
			person[i].car = new Car();
			person[i].phone = new Phone();
			person[i].shoes = new Shoes();	
		
		
		// 사용자로부터 입력받자
		// 이름 입력받기
		System.out.println("사람이름");
		String name = sc.next();
		
		System.out.println("차이름은?");
		String carName = sc.next();
		
		System.out.println("차가격은?");
		int carPrice = sc.nextInt();
		
		person[i].car.name = carName;
		person[i].car.price = carPrice;
		
		System.out.println("폰 브랜드?");
		String phoneBrand = sc.next();
		
		System.out.println("폰가격은?");
		int phonePrice = sc.nextInt();
		
		person[i].phone.brand = phoneBrand;
		person[i].phone.price = phonePrice;
		
		System.out.println("신발 브랜드?");
		String shoesBrand = sc.next();
		
		System.out.println("신발가격은?");
		int shoesPrice = sc.nextInt();
		
		System.out.println("신발사이즈은?");
		int shoeSize = sc.nextInt();
		
		person[i].shoes.brand = shoesBrand;
		person[i].shoes.price = shoesPrice;
		person[i].shoes.size = shoeSize;
		}
		// 사용자로부터 찾고 싶은 사람의 이름을 입력받기
		String findName = sc.next();
		
		for(int i = 0; i < number; i++ ) {
			if(person[i].equals(findName)) {
			System.out.println(person[i].name + "의 폰은"+person[i].phone.brand);
		}
		}
		// 아까 만든 프로젝트에서 새 패키지 만들어
				// Student클래스 생성
				// name, age, Score
				//Score 클래스
				// kor,eng, math
				//StudentTest 클래스 생성
				// 사용자로부터 3명 이상의 학생의 정보를 입력받고
				// 각학생의 이름 과 나이 평균을 출력
				// 전체 학생의 수학 점수의 평균, 국어 점수의 평균, 영어 점수의 평균

	}

}
