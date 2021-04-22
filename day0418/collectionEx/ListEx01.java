package day0418.collectionEx;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		//제너릭을 사용해 사용하는 쪽에서 데이터 타입을 정하도록한다. 
		List<String> foodList;
		//이것도 같은 자료형을 묶어놓은 것이라 할 수 있다. 
		foodList = new ArrayList<String>();
		
		System.out.println("리스트의 크기 :" + foodList.size());
		
		// 음식 추가
		foodList.add("초밥");//초밥
		System.out.println("리스트의 크기 :" + foodList.size());
		
		foodList.add("대창");//초밥,대창
		System.out.println("리스트의 크기 :" + foodList.size());
		
		foodList.add("떡볶이");//초밥,대창,떡볶이
		System.out.println("리스트의 크기 :" + foodList.size());
		
		//list.get(Index);==> get가져옴 // 배열과 비슷한데 단지 메서드를 이용해 넣고 빼는것
		System.out.println("index 0번의 음식 :" + foodList.get(0));
		System.out.println("index 1번의 음식 :" + foodList.get(1));
		System.out.println("index 2번의 음식 :" + foodList.get(2));
		
		// 0번과 1번 사이에 차돌박이를 넣어보자
		foodList.add(1,"차돌박이");
		System.out.println(foodList);
		
		// 제거 // remove는 equals로 비교했을때 같은 것을 지운다
		// 객체가 들어가면 hash를 비교해서 같은 주소만 지운다. 
		String remindStr = foodList.remove(3); // 떡뽁이 저장
		System.out.println(remindStr);
		Boolean result = foodList.remove("떡볶이");
		System.out.println(result);
		
		System.out.println("대창이 있는가?"+foodList.contains("대창"));
	}

}
