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
		return "�������� : " + account + "\t" + balance + "\t" + interestRate;
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
			throw new Exception("�Ա� �ݾ��� 0���� �����ϴ�.");
		balance += money;
	}

	public void withdraw(double money) throws Exception {
		if (money < 0 || money > balance)
			throw new Exception("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		balance -= money;
	}

}
