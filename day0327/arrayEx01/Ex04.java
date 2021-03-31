package day0327.arrayEx01;

public class Ex04 {

	public static void main(String[] args) {
		// 배열을 만드는 방법  1
		int[] array1 = new int[5]; //[0,0,0,0,0] 빈값을 만들어준다. 
	
		// 배열을 만드는 방법  2 : 변수 생성과 값을 동시에 // 처음 초기화 할때만 이렇게 써줄 수 있다
		int[] array2 = {1,2,3,4,5}; // new없이 값을 넣어줄 수 있다
									// [1,2,3,4,5] 힙으로 넣어줌
		
		// 배열을 만드는 방법  3
		int[] array3 = new int[] {1,2,3,4,5};
		
//		     // 따로 분리시 1
//		     int[] array1;
//		     array1 = new int[5];
//		     
//		     // 2번은 분리가 안된다.
//		     
//		     // 따로 분리시 3
//		     int[] array3;
//		     array3 = new int[] {1,2,3,4,5}
		
	}

}
