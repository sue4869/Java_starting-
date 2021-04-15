package day0411.lobot01;

public class Transformer {
	String name; // 객체를 생성할 때 트랜스포머에 넣어주자
	
	public Transformer() {
		name = "트랜스포머";
	}
	
	public void fight() {
//		System.out.println("트래스포머가 전투를 시작합니다."); // 이름이 바뀌니 변수 name 만들어야징
		System.out.println(name + "가 전투를 시작합니다. ");
		System.out.println("미사일 공격!"); // 태권브이와의 차이
		System.out.println("걸어서 이동");
		System.out.println("미사일 공격!");
		System.out.println("트랜스포머가 전투를 종료합니다.");
	}
}
