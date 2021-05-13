package day0425;

import java.util.Arrays;

public class Ex02_02 {

	public static void main(String[] args) {
		System.out.println("배열 생성");
		int[] num = new int[10];
		
		System.out.println("배열에 값 삽입");
		try {
			for(int i=0; i < 10; i++) {
				num[i+1] = i+1; //예외가 발생하면 예외 객체가 발생하고 종료
			}
			//예외상황에 관련된 함수가 아니면 catch가 안된다. 
			// 예외 종류에 관한 것이 정의 되어있어야 한다. 
			// 예외의 종류가 다르면 catch가 안된다. 
		} catch(ArrayIndexOutOfBoundsException e) {//예외객체가 e로 들어간다. 
			System.out.println("예외발생");
			e.printStackTrace();//쌓여있는 오류내용(예외상황)을 보여준다
		} // 이렇게 되면 10이 안들어간 상태로 출력이 된다.
		
		System.out.println("배열 내용 출력"); 
		System.out.println(Arrays.toString(num));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	}

}
