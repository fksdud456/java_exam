package day13;

import java.io.*;
/*
 * ���� ����� ���� �ϳ��� �о���� ����
*/
public class FileReaderTest {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("c:\\iotest\\output.txt");) {
			int data;
			while (true) {
				data = reader.read();
				if (data == -1)
					break;
				System.out.print((char) data);
			}
		} catch(FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch(IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}

}