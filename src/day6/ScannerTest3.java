package day6;
import java.util.Scanner;
public class ScannerTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����(����)�� �Է��� �ּ��� : ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		System.out.printf("�� : %d%n", number1 + number2);// \n
		System.out.print("�� ���� ����(�Ǽ�)�� �Է��� �ּ��� : ");
		double number3 = sc.nextDouble();
		double number4 = sc.nextDouble();
		System.out.printf("�� : %.2f%n", number3 + number4);
		sc.close();
	}
}






