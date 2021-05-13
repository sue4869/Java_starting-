package day0425.practice;

import java.util.ArrayList;

public class NullPointerPractice {
	//1.
	//nullpointer 예외를 발생시키는 상황을 만드는 코드를 작성 :
	//예외처리하는 내용까지 작성.]
	//null인 객체가 메서드를 호출할때 (이때만이 아니라 무엇인가 사용하려할때)
	
	public static void main(String[] args) {
		ArrayList<String> food = new ArrayList<String>();
		food.add("자장면");
		food.add("자장면2");
		food.add("자장3");
		food.add(null);
		food.add("자장면5");
		
		for(int i=0; i<food.size(); i++) {
			//1. null이 들어간다고 오류가 나오지는 않는다. 
			//System.out.printLn(food.get(i)); //널이 있어도 잘작동
			
			//2.
			String str = food.get(i);
			System.out.println(str);
			
			// 널을 찾으려고 할 때 오류발생한다. 
			str.equals(null);
		}
		
		
	}

}
