package day6;
import java.util.Scanner;
public class ScannerTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("�����͸� �Է��ϼ��� : ");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.nextLine();  // �Է¹��ۿ� �����ִ� ���๮�ڸ� û���ϴ� ���
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		System.out.printf("[%s] [%s] [%s] [%s]", str1, str2, line1, line2);
		sc.close();
	}
}






