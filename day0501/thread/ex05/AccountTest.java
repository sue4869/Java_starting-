package day0501.thread.ex05;

public class AccountTest {
	static Account account = new Account();//공용으로 쓸 계좌
	
	public static void main(String[] args) {
		User u1 = new User(account, "만수르");
		User u2 = new User(account, "주커버그");
		
		u1.start();
		u2.start();
		
//같은 공용의 계좌에 입금과 출금을 둘이서 쓰레드를 이용해 동시에 접근하다보니 행동의 누락이 발생
// 따라서 출금을 a 객체가 접근할때는 b는 접근못하고 대기하도록 해야한다. 
//==> 싱크로나이드: 한메서드를 동시에 접근하지 못하도록
// 두 쓰레드가 동시에 account를 접근하다보니
// 연산이 겹쳐져 누락되는 상황이 발생
	}
}
