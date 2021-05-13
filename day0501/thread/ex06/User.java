package day0501.thread.ex06;

public class User extends Thread{
	private Account account; //자신의 계좌를 필드로
	String name;
	
	public User(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public void doSomeThing() {
		for(int i =0; i <100; i++) {
			//1000 입금
			account.deposit(10000);
			
			try {
				Thread.sleep(99);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			//1000 출금
			account.withdraw(10000);
			
			//계좌 조회
			System.out.println(name + "의 잔금 :" + account.getBalance());
		}
	}

}
