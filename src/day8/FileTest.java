package day8;
import java.io.File;
import java.util.Scanner;
public class FileTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		sc.close();
		System.out.print("���ϰ���Է� : ");
		File f = new File(fileName);
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("���丮�Դϴ�.");
			} else {
				System.out.println(f.length()+" ����Ʈ�� �����Դϴ�.");
			}
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}
}
