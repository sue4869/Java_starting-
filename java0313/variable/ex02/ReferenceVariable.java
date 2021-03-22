package java0313.variable.ex02;

public class ReferenceVariable {
	public static void main(String[] args) {
		// 참조변수 : 클래스를 배운 후 자세히 - 무언가를 참조해서 쓴다. 
		//        : 어딘가에 값을 저장하여 그 위치값을 따로 저장한다.
		//        --> String 은 ""을 쓰고 여러 문자 가능
		// 기본 자료형 : 직접 값을 넣어둠  --> char 은 ''을 쓰고 한글자만 가능
		// 저장값이 다르다 : 직접적인 값 저장(기본변수)vs 값의 위치값, 주소 저장(참조 변수)
		
		String name; //자료형 String -첫글자가 대문자
		name = "가렌";
		
		String name2 = new String("베인"); //참조변수 만들기
			
	}


}
