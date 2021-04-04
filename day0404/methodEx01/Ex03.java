package day0404.methodEx01;

public class Ex03 {
	// 두 수를 더하여 출력
	// Calc를 이용하여 두수의 합을 출력해보시라
	
	public static void main(String[] args) {
		
	
	
	Calc calc = new Calc();//1. 객체 만들기
	calc.add(10,20); // 2. 메서드 불러오기
	// 출력을 해버린 것이기에 평균을 구한다랄지의 응용이 안된다
	// 두수의 합은 출력(콘솔에 글자를 나타나게 ) 하고 사라짐
	// int s = greeting.sum(10, 20); ==> 이렇게 저장이 안됨
	System.out.println("*****************");
	
	// 두수의 평균 구하기
	// 두수의 합을 반환하는 메서드를 구현한다. 
	int result = calc.sum(10, 20);
	System.out.println(result / 2);
	
	calc.sumMulti(10,20,30);
	
	}
	
	
}
