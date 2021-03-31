package day0327.arrayEx01;

public class Ex05 {

	public static void main(String[] args) {
		// 배열변수 --> 또다른 말로 : 참조변수 , reference 변수
		
		// 변수는 스택라는 공간에 있고, 대상을 가르키는 주소도 스택에 있다
		// 객체는 힙이라는 공간에 있다
		// 객체를 담는 변수 : 참조변수, reference 변수
		// new면 힙영역에 객체라는 대상을 만들었겠구나 라고 생각
		
		int[] numbers = new int[5];
		int[] copy;
		
		numbers[0] = 100;
		numbers[1] = 90;
		numbers[2] = 80;
		numbers[3] = 70;
		numbers[4] = 60;
		
		//copy에 복사 --> copy라는 변수는 int형을 넣을 수 있다.
		copy = numbers; // numbers의 값이 copy에 들어간다
						// 주소를 복사한것, 실제 힙에 객체는 1개
						// 얕은 복사, reference copy, shallow copy
						// 참조 변수가 2개 --> 주소를 가진 아이가 두명이 된것
		
		System.out.println("copy = numbers; 후");
		System.out.println("copy[0] : " + copy[0]); // 100
		System.out.println("numbers[0] : " + numbers[0]); //100
		System.out.println("copy[3] : " + copy[3]); //70
		System.out.println("numbers[3]" + numbers[3]);//70
		
		copy[2] = 0;
		System.out.println("copy[2] :" +copy[2]); // 0
		System.out.println("numbers[2]" + numbers[2]); //80이 아니라 0이 나온다
		// 객체를 copy와 공유하고 있기 때문에 바꿔진 값이 나오는 것
		
		// 값 전체를 직접 복사하려면?? 새롭게 객체를 만들어야 한다. // 값들의 복사 : 깊은 복사, deep copy
		// 원본의 값 자체를 넣어주는 것 
		int[] copy1 = new int[5];
		copy1[0] = numbers[0];
		copy1[1] = numbers[1];
		copy1[2] = numbers[2];
		copy1[3] = numbers[3];
		copy1[4] = numbers[4];
		

	}

}
