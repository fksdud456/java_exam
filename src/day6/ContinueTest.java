package day6;
import java.util.Scanner;
public class ContinueTest {
	public static void main(String[] args) {
		final char DECO_MARK = '$';		
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");	
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(DECO_MARK);
			}
			System.out.println();
		}		
		scan.close();
		System.out.println("-��������-");	
	}
}






