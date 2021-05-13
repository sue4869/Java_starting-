package day0501.thread.ex05;
//계좌를 같은데 입금과 출금
public class Account {
	private int balance;
	
	//예금
	public void deposit(int amount) {
		balance += balance;
	}
	
	//출금
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	//예금값 반환
	public int getBalance() {
		return balance;
	}
}
