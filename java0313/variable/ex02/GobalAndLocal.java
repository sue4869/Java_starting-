package java0313.variable.ex02;

public class GobalAndLocal {
	int gNum = 20; //변수선언 //클래스 내 어디서든 쓸수 있다

	public static void main(String[] args) {
		//변수의 적용범위
		//자바는 {}블럭 단위로 구분한다.
		int INum = 30; //지역변수 //main메서드안에서만 살아있다.
		int gNum2 = 10;
		
		if(true) {
			//int INum2 = 10;
			System.out.println("if{}-gNum:" + gNum2);
			System.out.println("if{}-gNum:" + INum);
		}
	}


}
