package day0424.setEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set에는 인터페이스를 상속받는 클래스 두개가 있다. : hashSet. TreeSet
public class SetEx {

	public static void main(String[] args) {
		Set<Integer> number = new HashSet<Integer>();
		
		number.add(2);
		number.add(4);
		number.add(6);
		number.add(8);
		number.add(10);
		
		//집합(묶음)이라 특정 위치의 값을 꺼낼 수 없다. 따라서 해당 묶음 전체를 꺼내는 방법을 사용해야 한다. 
		// Iterator 라는 객체로 꺼내야 함 : 저장된 데이터들 사이에서 순방향으로 이동하면서 데이터를 가져오거나 삭제할 수 있는 기능 제공
		
		Iterator<Integer> it = number.iterator();
		//hasNext() : Iterator가 순방향으로 이동하는데,Iterator가 가리키는 데이터저장소의 현재 위치에서 이동할 항목이 있는지 체크한다.
		while(it.hasNext()) { // 이동할 항목이 있을때 true 반환
			//next() : Iterator가 자신이 가리키는 데이터저장소에서 현재위치를 순차적으로 하나 증가해서 이동하는 것 
			System.out.println(it.next());// 실제 이동시키는 것 // 다음 순서에 있는 거 꺼낸
		}
		System.out.println("--------------");
		
		//1~27에서 3의 배수를 30보다 작은 3의 배수 set number3에 담으시오
		
		Set<Integer> number3 = new HashSet<Integer>();
		for(int i = 1; i < 30; i++) { 
			if (i % 3 == 0) {
				number3.add(i);
			}
		}
		System.out.println(number3);
		// 또는
		for(int num : number3) { //integer안에 int가 들어있으니 쓸수 있는것
			System.out.println(num);
		}
		
		// 합집합		
		// 차집합
		// 교집합 가능
		// 대신 기준으로 삼을 set이 필요함
		
		//2의 배수와 3의 배수의 합집합
		Set<Integer> hap = new HashSet<Integer>(number); //2의 배수를 넣은 합의 객첼를 만드는 것
		//1~27사이의 2의 배수를 number에 넣기
		System.out.println("2의 배수");
		for(int i = 1; i <= 27; i++) {
			if(i%2 == 0) {
				number.add(i);//중복이 허용이 안됨
				System.out.println(" "+i);
			}
		}
		
		hap.addAll(number3);
		System.out.println("합집합");
		for(int num : hap) {
			System.out.println(num + " ");
		}
		
		// 차집합
		Set<Integer> cha = new HashSet<Integer>(number);
		cha.remove(number3);// 그중에 3의 배수 있는 것을 지운다. 
		
		System.out.println("2의 배수 - 3의 배수 차집합");
		for(int num : cha) {
			System.out.println(num + " ");
		}
		
		//교집합
		Set<Integer> ko = new HashSet<Integer>(number);
		ko.retainAll(number3); // 2의 배수중 3의 배수와 겹치는 것
		System.out.println("교집합");
		for(int num : ko) {
			System.out.println(num + " ");
		}
	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
