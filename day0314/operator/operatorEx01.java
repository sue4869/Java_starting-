package day0314.operator;

public class operatorEx01 {

	public static void main(String[] args) {
		// 산술연산자
		//+,-,*,/,%
		System.out.println(20 + 10); //30
		System.out.println(20 - 10); //10
		System.out.println(20 * 10); //200 
		System.out.println(20 / 10); //2 --> 정수에서 정수로 나누면 정수 결과로
		System.out.println(20 / 10.0); //2.0 --> 실수가 비연산자에 있으면 결과도 실수로
		System.out.println(20 % 10); //0 //나머지 구하기 // 어떤 수의 배수
		
		//100은 2의 배수인가?? 나머지가 0인 아이를 찾는다.
		
		int num = 55;
		//20을 더한 결과는?
		System.out.println(num + 20);
		//10을 뺀 결과는?
		System.out.println(num - 10);
		//2를 곱한 결과는?
		System.out.println(num * 2);
		//4를 나눈 결과는?
		System.out.println(num / 4);
		//9로 나눴을 때 나머지는?
		System.out.println(num % 9);
		
		//계산의 결과를 변수에 저장해보자 --> 변수는 임시저장소
		int resultAdd = num + 20;
		int resultMinus = num - 10;
		int resultMulti = num * 2;
		int resultDiv = num / 4;
		int resultRemainder = num % 9;
		
		System.out.println("덧셈의 결과:" + resultAdd);
		System.out.println("뺄셈의 결과:" + resultMinus);
		System.out.println("곱셈의 결과:" + resultMulti);
		System.out.println("나눗셈의 결과:" + resultDiv);
		System.out.println("나머지:" + resultRemainder);
		
		//복합대입연산자
		//num변수에 20을 더해서 다시 num에 저장
		num = num + 20; //num=55일때 20을 더한것을 num에 저장
		num += 20; // 왼쪽에 연산자 오른쪽 대입연산자
		System.out.println("num = num + 20의 결과는"+num);
		
		num = num - 10; 
		num -= 10; 
		System.out.println("num = num - 10의 결과는"+num);
		
		num = num * 2; 
		num *= 2; 
		System.out.println("num = num * 2의 결과는"+num);
		
		num = num / 4; 
		num /= 4; 
		System.out.println("num = num / 4의 결과는"+num);
		
		num = num % 9; 
		num %= 9; 
		System.out.println("num = num % 9의 결과는"+num);
		

	}

}
