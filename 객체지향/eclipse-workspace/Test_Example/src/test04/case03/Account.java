package test04.case03;

public class Account {
	private String name;
	private int balance;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
			this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if(balance < 0) {
			this.balance = 0;
			return;
		} //무결성 인지 및 처리 코드
		this.balance = balance;
	}
}
