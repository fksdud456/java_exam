package day3;
public class WhileTest3 {
	public static void main(String[] args) {
		int money = 2000;
		int spending;
		while(money > 0) {
			System.out.println("���� �ܾ� : " + money);
			spending = (int)(Math.random()*1000) + 100;
			if(money >= spending) {
				money -= spending;
				System.out.println("\t���� �ݾ� : " +spending);
			} else {
				System.out.println("\t�Ϻ� ���� : " +money);
				System.out.println("\t\t�̱� �ݾ� : "+
				                       (spending-money));
				money = 0;				
			}
			if (money <= 500) {
				System.out.println("���� �ܾ� : " + money);
				break;
			}
		}
		System.out.println("�� ���� ����...�̤�");
	}
}
