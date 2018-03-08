package day3;

public class WhileLab2 {
	public static void main(String[] args) {
		int num;
		char ch = 64;
		int count = 0;
		while (true) {
			num = (int) (Math.random() * 31);
			if (num >= 1 && num <= 26) {
				System.out.println((char) (ch + num) + "(" + num + ")");
				count++;
			} else
				break;
		}
		System.out.println("수행횟수는 "+count+"번입니다");
	}
}
