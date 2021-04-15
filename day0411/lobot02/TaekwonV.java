package day0411.lobot02;

public class TaekwonV extends Lobot{
	// String name;
	// 이름 객체 만들어주는 것도 공통이니 부모에게 //지우지 않으면 name객체가 부모와 자식 각각 한개씩 생김
	
	public TaekwonV() {
		name = "택권브이";
	}
	
	// 택권브이와 트랜스포머의 fight가 비슷하니 부모인 Lobot을 만들어주자 ==> fight메서드 생략
	// 다른 것만 부르기
	
	public void attack() {
		System.out.println("펀치 공격!");
	}
	public void move() {
		System.out.println("날아서 이동");
	}
}
