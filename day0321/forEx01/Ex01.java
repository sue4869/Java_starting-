package day0321.forEx01;

public class Ex01 {

	public static void main(String[] args) {
		int a = 0;
		while(a < 5) {
			System.out.println("안녕하세요"+a); //a=4
			a++;
		}
		System.out.println(a);// 여기서 a = 5

	
	
	//for문
//	for(초기값; 조건식; 증감식) {
//		실행할 문장;
//	}
		//실행 순서 주의
//                    8		
//                    5	    7
//            1       2		4   
	for(int i = 0; i < 5; i++) {
		System.out.println("안녕하세요" +i);//3 6
	} 
	//9
	
	// while --> 횟수가 정해지지 않을때 주로 사용 ~~까지
	// for   --> 횟수가 정해져 있을때 
	
	
	
	

}
}
