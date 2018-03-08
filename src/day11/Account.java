package day11;

public class Account {
	private String account;
	private double balance;
	private double interestRate;

	public Account() { }

	public Account(String account, double balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	

	@Override
	public String toString() {
		return "계좌정보 : " + account + "\t" + balance + "\t" + interestRate;
	}

	public String getAccount() {
		return account;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public double calculateInterest() {
		return balance * interestRate / 100;
	}

	public void deposit(double money) throws Exception {
		if (money < 0)
			throw new Exception("입금 금액이 0보다 적습니다.");
		balance += money;
	}

	public void withdraw(double money) throws Exception {
		if (money < 0 || money > balance)
			throw new Exception("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		balance -= money;
	}

}
