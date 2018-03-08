package day3;
public class WhileTest3 {
	public static void main(String[] args) {
		int money = 2000;
		int spending;
		while(money > 0) {
			System.out.println("현재 잔액 : " + money);
			spending = (int)(Math.random()*1000) + 100;
			if(money >= spending) {
				money -= spending;
				System.out.println("\t지급 금액 : " +spending);
			} else {
				System.out.println("\t일부 지급 : " +money);
				System.out.println("\t\t미급 금액 : "+
				                       (spending-money));
				money = 0;				
			}
			if (money <= 500) {
				System.out.println("현재 잔액 : " + money);
				break;
			}
		}
		System.out.println("쓸 돈이 없다...ㅜㅜ");
	}
}
