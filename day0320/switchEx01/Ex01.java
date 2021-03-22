package day0320.switchEx01;

public class Ex01 {

	public static void main(String[] args) {
		// swith-case
		// 형식
//		switch(key) {
//		case 값1:
//			key가 값1과 같을때 실행할 문장
//		case 값2:
//			key가 값2와 같을때 실행할 문장
//		default
//			key가 case에 없을때 실행할 문장
//		}

		// key에는 "문자열", '문자하나', 숫자가 들어갈 수 있다
		
		//아침, 점심, 저녁, 그 외냐에 따라 다르게 실행하는 switch-case문
		String bob = "점심";
		switch(bob) {
		case "아침":
			System.out.println("맥모닝과 커피");
			break;
			
		case "점심":
			System.out.println("김밥");
			break;
	
		case "저녁":
			System.out.println("굶어라");
			break;
			
		default :
			System.out.println("야식먹니?");
			break;
		}
		
		//break를 받느시 기억하자!
		//case는 참이 나오면 그 뒤에 나오는 것들은 전부 출력한다!
		
		
	}

}
