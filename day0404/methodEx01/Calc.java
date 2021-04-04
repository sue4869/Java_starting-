package day0404.methodEx01;

public class Calc {
	// 두슬 더해 출력하는 메서드 만들어 보기
	// 메서드 정의: 클래스 안에 선언하세요.
	void add(int n1, int n2) {
		System.out.println(n1 + n2);
	} // void 밖으로 나가면 number1과 number2는 없어진다. 
	
	int sum(int n1, int n2) {
		return n1 + n2;
	}
	// 더 많은 숫자를 매개변수로 받으려면??
	int sumMulti(int ...numbers) {  // int ...numbers ===> 배열만 받는 다는 뜻
		int total = 0;				// 작성할때는 그냥 숫자 적어주는데, 메서드로 들어갈때 자동으로 배열형식으로 들어간다
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
}
