package day0424.mapEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx01 {

	public static void main(String[] args) {
		// map : 사전구조와 같은 형태
		// Key: value로 이루어진 구조
		// Map<K, V> : Key와 Value값의 타입을 지정해줘야 한다. 
		
		Map<Integer, String> foodMap = new HashMap<Integer,String>();
		//key는 중복을 허용하지 않는다. 따라서 set으로 받아볼수 있다. 
		
		//추가 메서드 : put(key, 값)
		// 리스트는 값만 넣으면 되는데 map은 인덱스를 다 지정해놓아야 한다. 
		foodMap.put(0, "자장면");
		foodMap.put(1, "짬뽕");
		foodMap.put(2, "볶음밥");
		
		//꺼낼 때는 get(key) 형태
		//System.out.println(foodMap.get(0));
		
		for(int i = 0; i < foodMap.size(); i++) {
			System.out.println(foodMap.get(i));
		}
		
		//키는 중복을 허용안한다. 키가 같을때 value를 다른 값으로 넣는다면?
		foodMap.put(0, "멘보샤"); //덮어씌운다
		
		//Map은 키가 꼭 순서대로일 필요없다
		// 탕수육은 키가 5인 번호에 넣자
		foodMap.put(5, "탕수육");
		// 중간에 빈상태로 5에 값이 들어간거기에 for문이 아닌 다른 방법을 써야한다. ==> set 이용
		Set<Integer> keys = foodMap.keySet();// key 값만 필요한 경우 :keySet
		for(int k : keys) {
			System.out.println(foodMap.get(k)); //set으로 키를 꺼낸다. 그러나 비효율적
		}
		
		// 값만 꺼낼 수 없다. 무조건 키와 값이 쌍으로 꺼내야 값을 꺼낼수 있다. : entrySet
		Set<Entry<Integer, String>> entrySet = foodMap.entrySet();
		for( Entry<Integer,String> e : entrySet) { //entrySet을 하나 꺼내면 Entry라는 자료형이 나오고, for( set의 낱개인 Entry : entrySet)
			System.out.println("키: " + e.getKey());
			System.out.println("키 : " + e.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
