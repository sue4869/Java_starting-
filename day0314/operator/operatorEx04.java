package day0314.operator;

public class operatorEx04 {

	public static void main(String[] args) {
		// 관계연산자
		// >,<, >= ,<=,==
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 = num2);//num2를 num1에 넣었기에 20으로 출력
		
		int num11 =5;
		int num22 =10;
		int num33 =5;
		System.out.println("num11 > num22" + (num11 > num22));//f
		System.out.println("num11 == num22" + (num11 == num22));//f
		System.out.println("num11 != num22" + (num11 != num22));//t
		System.out.println("num11 == num33" + (num11 == num33));//t
		
		char c1 = 'A';//아스키코드 65 --> 컴퓨터는 A를 65로 저장함. 표현만 A로
		char c2 = 'a';//아스키코드 97
		char c3 = 'a';
		char c4 = 'b';//아스키코드 98이라 예쌍

		System.out.println(c1 + 0);//char인 c1을 int와 연산하였지만 int로 출력
								   //숫자와 숫자로 인식해서 계싼
							       //실제로 숫자로 저장되어있어서//65로 출력
		System.out.println((char)(c1 +1));//int를 char로 형변환 //B로 출력
		System.out.println("c1 > c2 :" + (c1 > c2));//숫자이기에 비교가능
		
		//소문자를 대문자로 변환
		char c5 = 'g';
		// c5 = c5 - 32 //오류난다//c5은 char, c5-32는 int값
		c5 =(char)(c5-32); //더 큰 그릇으로 형변환 해야함
		c5 -= 32; //이때는 자체적으로 형변환이 되기때문에 따로 안써줘도 된다.
		
		int number = 128;
		// byte bNumber = number //오류난다//byte는 -128~127까지여서 128은 안들어가짐
		byte bNumber = (byte)number; //형변환해야한다. 
		System.out.println("bNumber" + bNumber); // 1000 0000여서 맨앞이 부호라 -첨가		
	}

}
