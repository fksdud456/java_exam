package day3;

public class WhileLab3 {
	public static void main(String[] args) {
		int dan = 9;
		int num = 1;
		System.out.println("������");
		while (dan >= 5) {
			System.out.print(dan + "��: ");
			while (num <= 9) {
				System.out.print(dan + "x" + num + "=" + dan * num + "  ");
				num++;
			}
			dan--;
			System.out.print("\n");
			num = 1;
		}
	}
}
