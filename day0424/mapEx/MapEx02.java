package day0424.mapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		//키가 이름
		// 값이 연봉형태의 map을 만들어 
		// 3명의 데이터를 넣고
		// 모두 꺼내어 출력해보세요
		
		Map<String, Long> employee = new HashMap<String, Long>();
		employee.put("홍길동", 10000l);
		employee.put("홍길만", 20000l);
		employee.put("홍길순", 30000l);
	
		//모든 사람이 각각 받는 전체 연봉은?
		//set형태에 entry자료형을 쓴다. 
		Set<Entry<String,Long>> entrySet = employee.entrySet();
		for(Entry<String, Long> e : entrySet ) {
			System.out.print(e.getKey());
			System.out.println(e.getValue());
			}
		
		// 홍길동은 얼마를 받는가?
		System.out.println(employee.get("홍길동"));
		
		// 값들만 꺼내기. value를 컬렉션으로 꺼낸다.
		Collection<Long> salary = employee.values();
		for(Long s : salary) {
			System.out.println(s);
		}
		
		//HomeWork
		// 1. set을 이용하여 
		// 로또번호를 생성하여 출력하시오
		// 1~45까지의 숫자 6개가 중복없이 만들어서 출력하는 코드

		//2.map을 이용
		// Employee 클래스를 생성
		//String name, int salary, String address 를 갖는 클래스를 만들고
		//키에 4번을 넣고 , value에 Emplyee객체를 넣을 수 있는 map을 만들어
		// 3명의 객체를 만들어 넣고
		// 사용자로부터 입력받은 입력받은 사번의 이름과 연봉, 주소를 출력하시오
		
		
		
		
		
		
		
		
		
		
		
		}
	}
