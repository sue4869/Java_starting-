package day0320.ifEx01;

public class Ex01 {

	public static void main(String[] args) {
		// 조건식
//		 형식 : if (조건식) {
//			 참일때 실행하려는 문장1;
//			 참일때 실행하려는 문장2;
//		 }
		// 조건식은 결과가 boolean으로 나온다
		
		int age = 15;
		if(age > 20) {  //age가 15라서 false
			System.out.println("성인입니다");
		}
		
		
		//if-else : 둘중 하나는 무조건 실행
		//조건식이 참이 아니면 else를 실행한다. 
//		if (조건식) {
//			실행할 문장1
//		}
//		else {
//			실행할 문장2	
//		}
		
		System.out.println("-----------------");
		if(age > 20) {
			System.out.println("성인입니다");
		}
		else {
			System.out.println("미성년자입니다");
		}
		

	}

}
