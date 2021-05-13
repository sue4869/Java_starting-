package day0501.thread.ex06;

public class AccountTest {
	static Account account = new Account();//공용으로 쓸 계좌
	
	public static void main(String[] args) {
		User u1 = new User(account, "만수르");
		User u2 = new User(account, "주커버그");
		
		u1.start();
		u2.start();
		
	}
}
