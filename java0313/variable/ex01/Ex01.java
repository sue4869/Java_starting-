// 변수(variable) : 데이터 값들이 저장되는 메모리 공간, 그릇, 변할 수 있는 수
package java0313.variable.ex01;

public class Ex01 {
	

	public static void main(String[] args) {
	//변수
			//정수 byte int short long
			byte myByte; 	// 변수 선언하기
			             	// 1 byte크기 8bit 0000~1111 = -128~127
			             	//              맨앞 0과 1은 부호를 말함
			short myShort;  // 2byte의 크기 6만정도
			int myInt;      // 4byte의 크기 20역 정도
			long myLong;    // 8byte의 크기 완전 큼
			// 두 단어이상 붙여쓸때 자바는 카멜(낙타)표현방식을 사용한다.
			// 단어들이 합쳐지는 시점의 첫글자는 대문자
			// 변수의 첫글자는 소문자로 시작 --> 소문자를 보면 이건 변수!
			
			//float과 Double은 정확도의 차이
			float myFloat; 	//4byte
			double myDouble;//8byte
			System.out.println(0.3-0.1); // 실수끼리의 계산은 기본적으로 double로
			
			//논리 : boolean --> true, false
			boolean myBoolean;
			
			//문자형 :char
			char myChar;   //2byte

}
}
