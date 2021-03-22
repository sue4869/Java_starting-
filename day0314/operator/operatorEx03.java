package day0314.operator;

public class operatorEx03 {

	public static void main(String[] args) {
		// 논리연산자
		//&& : and 연산자 --> 피연산자 둘다 참일 경우만 참
		//|| : or 면산자 --> 피연산자가 둘중 하나라도 참이면 참이다.
		// 정부지원금 
		// 경기도민이고 20세 이상인 사람에게 10만원씩 지원한다. ==> &&
		
		String local = "경기도";
		int age = 20;
		System.out.println("경기도이고 20세인 경우");
		System.out.println(local.contentEquals("경기도") && age >=20);
							//local 속에 들어있는 글자와 "경기도"라는 글자와 같냐
		local ="서울";
		age = 30 ;
		System.out.println("서울이고 30세인 경우");
		System.out.println(local.contentEquals("경기도") && age >=20);
		
		local ="제주도";
		age = 10 ;
		System.out.println("제주도이고 10세인 경우");
		System.out.println(local.contentEquals("경기도") && age >=20);
	
		//or의 예
		//영화관 10세이하이거나 65세 이상이면 오천원
		// 그외는 팔천원
		age = 20;
		System.out.println("영화예매시스템");
		System.out.println("영화관 10세이하이거나 65세 이상이면 오천원으로 할인");
		System.out.println("나이가" + age +"세 인 사람은?");
		System.out.println(age <= 10 || age >= 65); //첫번째 조건이 성립할 경우 뒤 조건 검사는 안한다
		System.out.println(age <= 10 | age >= 65); // 첫번째 조건이 성립해도 뒤조건까지 확인한다. 
		
	}
}
