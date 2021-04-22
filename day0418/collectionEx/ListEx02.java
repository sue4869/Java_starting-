package day0418.collectionEx;

import java.util.ArrayList;

public class ListEx02 {

	public static void main(String[] args) {
		//ArrayList numbers를 만들고
		//2~10까지의 숫자를 추가 후 출력[2,3,4,5,6,7,8,9,10]
		//index 3번의 숫자를 제거 후 출력[2,3,4,6,7,8,9,10]
		//index 7번에  100을 추가 후 출력[2,3,4,6,7,8,9,100,10]
		//2의 배수를 모두 제거한 후 출력[3,7,9]
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 2; i < 11; i++) {
			numbers.add(i);
		}
		System.out.println(numbers);
		
		numbers.remove(3);
		System.out.println(numbers);
		
		numbers.add(7, 100); 
		System.out.println(numbers);
		
		int cnt = 0;
		for(int i =  numbers.size() - 1; i >= 0; i--) { //배열 사이즈가 계속 달라짐을 생각하기
			if(numbers.get(i) % 2 == 0 ) { // arraylist이기 때문에 그냥 numbers[i]로 하면 안된다. 
				numbers.remove(i);
			}
		}
		System.out.println(numbers);
		// 배열은 항상 객체를 만들어야 하기 때문에 list로 쓰면 더 편리해서 사용한다. 
			
		
	}

}
