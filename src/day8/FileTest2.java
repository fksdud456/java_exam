package day8;
import java.io.File;
public class FileTest2 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("�����Ϸ��� ���ϸ��� ���α׷� �ƱԸ�Ʈ�� �����ϼ���.");
			return;		
		}
			
		File f = new File(args[0]);
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println(args[0] + " ���丮�Դϴ�.");
			} else {
				System.out.println(args[0] + " : " + f.length()+" ����Ʈ�� �����Դϴ�.");
			}
		} else {
			System.out.println(args[0] + "�������� �ʽ��ϴ�.");
		}
	}
}
