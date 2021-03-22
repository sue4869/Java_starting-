package java0313.variable.ex01;

public abstract class VariableTest {
	public static void main(String[] args) {
		//8개 종류의 변수를 만들고
		//각각의 변수에 값을 넣으세요
		//그리고 각 변수들을 출력해보세요

		byte myByte;
		myByte = 8;
		System.out.println(myByte);

		int myInt; 
		myInt = 10;
		System.out.println(myInt);

		long myLong;
		myLong = 10000000l;
		System.out.println(myLong);

		short myShort;
		myShort = 1000;
		System.out.println(myShort);

		float myFloat;
		myFloat = 0.1f;
		System.out.println(myFloat);

		double myDouble;
		myDouble = 0.01;
		System.out.println(myDouble);

		boolean myBoolean;
		myBoolean = true;
		System.out.println(myBoolean);

		char myChar;
		myChar = 'a'; //char은  문자열 한개만 가능
		System.out.println(myChar);
		
		//위 변수에 다른 값들을 다시 넣고 출력해보세요
		myByte = 7;
		System.out.println(myByte);
		myInt = 20;
		System.out.println(myInt);
		myShort = 3000;
		System.out.println(myShort);
		myLong = 500000000l;
		System.out.println(myLong);
		myFloat = 0.223f;
		System.out.println(myFloat);
		myDouble = 0.02;
		System.out.println(myDouble);
		myChar = 'a';
		System.out.println(myChar);

		//실행 단축키 ctrl +f11

	}


}
