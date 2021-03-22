package day0320.whileEx01;

public class Ex02 {

	public static void main(String[] args) {
		// 출력문 5번 반복으로 일정한 규칙으로 변경
		//안녕하세요1
		//안녕하세요2
		//안녕하세요3
		//안녕하세요4
		//안녕하세요5
		int i = 1; //반복계수의 시작값
		while(i > 6) {
			System.out.println("안녕하세요"+i);
			i++;
		}
		System.out.println("-------------");
		
		//안녕하세요9
		//안녕하세요8
		//안녕하세요7
		//안녕하세요6
		//안녕하세요5
		
		int j = 9;
		while(j < 4) {
			System.out.println("안녕하세요"+j);
			j--;
		}
		System.out.println("-------------");
		
		//1안녕하세요5
		//2안녕하세요6
		//3안녕하세요7
		//4안녕하세요8
		//5안녕하세요9
		
		int num1 = 1;
		while (num1 < 6) {
			System.out.println(num1 + "안녕하세요"+ (num1+4));
			num1 ++;
		}
		System.out.println("-------------");
		
		//안녕하세요2
		//안녕하세요4
		//안녕하세요6
		//안녕하세요8
		//안녕하세요10
		
		int num2 = 2;
		while (num2 < 11) {
			System.out.println("안녕하세요"+num2);
			num2 +=2;
		}
		
		int b = 1;
		int num3 = 2;
		while (b < 6) {
			System.out.println("안녕하세요"+num3);
			b++;
			num3 += 2;
			
		}
		
		
		
		
	
		

	}

}
