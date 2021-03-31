package day0327.arrayEx01;

public class Ex02 {

	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int n3 = 1;
		int n4 = 1;
		int n5 = 1;
		int n6 = 1;
		int n7 = 1;
		int n8 = 1;
		int n9 = 1;
		int n10 = 1;
		
		// 반복문이라는 것을 배웠으니 써볼까?
		//1~10까지 값을 넣어보자 --> 변수가 다 다른 변수들이기에 반복을 할 수 없다
		// 배열은 왜 쓸까? 반복문이 안되는 경우를 위해
		
		//배열 : 같은 자료형의 변수들의 묶음
		//자료형[] 변수명 --> 배열 변수의 선언
		// 변수 명 = new 자료형[개수]; --> 대입
		
		// 숫자 10개를 담을 수 있는 배열을 생성
//선언		int[] number;    
//대입		numbers = new int[10]; --> int 자료형의 10개짜리 배열 객체를 생성하여 numbers에 담음
//		                           --> 10개짜리 빈그릇
		int[] numbers = new int[10]; // 선언과 배열 동시에
		//배열의 접근 : 변수명[index번호] --> 해당되는 그릇의 몇번째
		//              index는 0부터 시작한다. 
		//numbers배열의 모든 공간에 1씩 담아보자
		
		numbers[0] = 1;
		numbers[1] = 1;
		numbers[2] = 1;
		numbers[3] = 1;
		numbers[4] = 1;
		numbers[5] = 1;
		numbers[6] = 1;
		numbers[7] = 1;
		numbers[8] = 1;
		numbers[9] = 1; // 변수명이 같은 것이라 반복 가능
		
		//반복문을 이용해서 1씩 넣어보자 // 변수는 스택, new는 반드시 힙 메모리로  --> 배열도 힙에
		for(int i = 0; i < 10; i++) { //인덱스는 주로 0부터 시작하니 주로 여기서는 i=0을 써준다. 
			numbers[i] = 1; //힙에 배열 [1,1,1,1,1,1,1,1,1,1] 저장
		}
		
		//변수는 스택에 들어가있는데 배열의 변수는 배열주소까지 같이 해서 들어있다. 
		//배열의 변수가 선언되면 힙에 배열의 공간이 생긴다. 그 공간마다 주소가 존재
		// numbers[]하면 힙에서 그 주소의 인덱스에 해당하는 값을 가져온다. 
		
		System.out.println("numbers[0]:" + numbers[0]);
		System.out.println("numbers[0]:" + numbers[0]);
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = i; // 힙에 배열 [1,2,3,4,5,6,7,8,9,10] 저장
		}
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;
		
		for(int i = 0; i < 10; i++) {
			numbers[i] =i+1;
		}
		System.out.println("-------------");
		//출력해보자
		for(int i=0; i < 10; i++) {
			System.out.println("numbers["+i+"] : " + numbers[i]);
			//printf는 format을 사용하겠다. %d는 정수를 대입 //,를 사용
			System.out.printf("numbers[%d] : %d" , i  , numbers[i]);
			
		}
		
		
	}

}
