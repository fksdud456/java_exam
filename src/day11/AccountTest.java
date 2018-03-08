package day11;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account("441-0290-1203", 500000.0, 7.3);
		System.out.println(account); 
		//객체 프린트 : account == account.toString() 

		try {
			account.deposit(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			account.withdraw(600000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("이자 : " + account.calculateInterest());
	}

}
