package day6;

import java.util.Scanner;

/*
 * ����ڰ� ���� ������, �����Է¹ް� �ﰢ���� ����� �� ���
 * �Ұ��� ����� 1 �� �Է��ϸ� ��� ���� 2�� �Է��ϸ� ����
 */
public class ContinueTest3 {
	public static void main(String[] args) {
		final char DECO_MARK = '$';
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int num = scan.nextInt();
			for (int i = 1; i <= num; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(DECO_MARK);
				}
				System.out.println();
			}
			System.out.print("����ϰڽ��ϱ�?(���:1,����2)");
			int prompt = scan.nextInt();
			if(prompt == 2) {
				System.out.println("�����ϰڽ��ϴ�...�ȳ�!!");
				break;
			}	
		}
		scan.close();
		System.out.println("-��������-");
	}
}
