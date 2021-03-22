package day0314.operator;

public class operatorEx06 {

	public static void main(String[] args) {
		// 삼항연산자
		// (조건식)? 참일때 값:거짓일때 값;
		int age = 10;
		char result = (age > 20)? 'T' : 'F';
		String reStr = (age > 20)? "성인입니다":"미성년자입니다";
		//String이니까 값에 문자열을 넣어야 한다
		
		//age가 5세미만이거나 80세이상일때 "무료입니다"를 변수에 저장하고
		//아닐때 "무료가 아닙니다"라는 문자열을 저장하고 출력하시오
		
		String result2 = (age <5 || age >= 80)? "무료입니다.":"무료가 아닙니다.";
		System.out.println("나이가 "+ age + "세이기 때문에 " + result2);

	}

}
