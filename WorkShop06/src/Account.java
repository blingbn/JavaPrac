
public class Account {
	String account;
	double balance;
	double interestRate;
	
	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public String getAccount() {
		
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void deposit(double money)throws AccoutException {
		if(money <= 0)
			throw new AccountException("입금 금액이 0보다 적습니다.");
	}
	
	
	

}
