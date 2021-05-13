package day0425.homeWork;

import java.util.HashSet;
import java.util.Set;

//1. set을 이용하여 
// 로또번호를 생성하여 출력하시오
// 1~45까지의 숫자 6개가 중복없이 만들어서 출력하는 코드

public class Lotto {
//	for(int i = 0; i < 6; i++) {
//	int num1 = (int)(Math.random()*45+1); // 45를 곱하면 0 ~44까지 숫자가 나옴
//	System.out.println(num1); //이렇게 하면 중복되는 수가 나올 수 잇다. 
//	lotto.add(num1);
//		}
//	System.out.println(lotto); // 이렇게 하면 중복되는 수는 set에 안들어가 개수가 6개가 아닐 수 있다.
//따라서 몇번 돌리냐가 아니라 언제까지 돌리냐로 해야 한다 ==> 6번 돌리는 게 아니라 숫자가 6개가 될때까지(set이 6개)
// while문이 유리
	
	public static void main(String[] args) {
		Set<Integer> lotto = new HashSet<Integer>();
		int number = (int)(Math.random()*45+1);
		//set에 6개가 다 찰때까지 반복
		while(lotto.size() < 6) { //0부터 시작하니 사이즈가 5여야 하나?
			lotto.add(number);
		}
		System.out.println(lotto);
	}

}
