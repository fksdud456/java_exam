package day6;
import java.io.File;
public class FileTest {
	public static void main(String[] args) {
		File f = new File("C:/yum/workspace/javaexam/src");
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

