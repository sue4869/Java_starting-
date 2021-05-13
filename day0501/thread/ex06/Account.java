package day0501.thread.ex06;
//계좌를 같은데 입금과 출금
public class Account {
	private int balance;
	
	//예금
	public synchronized void deposit(int amount) {
		balance += balance;
	}
	
	//출금
	// synchronized 쓰레드가 하나씩만 접근 가능하게 한다. 
	public synchronized void withdraw(int amount) {
		balance -= amount;
	}
	
	//예금값 반환
	// synchronized를 모든 메서드에 쓰면(굳이 안써도 되는 메서드에도 쓰면)단일메서드같이 실행
	public int getBalance() {
		return balance;
		// 우선순위를 다르게 하여 특정 쓰레드가 더 많은 작업시간을 갖도록 할 수 있다. 
	}
}
