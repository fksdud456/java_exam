package day7;

import java.io.File;

/* File��ü�� �� üũ�ϰ��� �ϴ� ���� ��θ� �����ؾ� �Ѵ�. 
 * �Ű����� ���� ��ü ������ �� �ִ� �����ڰ� ����
 */

public class FileTest2 {

	public static void main(String[] args) {
		File f = new File("C:/yum/workspace/JavaExam/src/day7/StudentTest.java");
		if(f.exists()) {
			if(f.isDirectory()) {
				System.out.println("���丮�Դϴ�.");
			} else {
				System.out.println(f.length() + "����Ʈ�� �����Դϴ�.");
			}			
		} else {
			System.out.println("�������� �ʽ��ϴ�.");
		}
	}

}
