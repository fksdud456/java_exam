package day3;
public class WhileLab1 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6 + 5);
		System.out.println("[for ���]");
		for (int i = 1; i <= num; i++) {
			System.out.println(i + " -> " + i * i);
		}
		System.out.println("[while ���]");
		int j = 1;
		while (j <= num) {			
			System.out.println(j + " -> " + j * j);
			j++;
		}
	}
}
