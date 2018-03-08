package day13;

import java.io.*;

public class FileWriterTest {
	public static void main(String[] args) {
		FileWriter writer = null;
		String path = "C:/iotest";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs();
		}

		try {
			writer = new FileWriter("c:/iotest/output.txt", true); // �ι��� arg��true -- append
			char arr[] = { '��', 'ü', '��', '��', '��', '��', 'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\r\n");
			writer.write(arr);
			writer.write("\r\n");
			writer.write("OCJP ���� ���");
			writer.write("\r\n");
			System.out.println("���Ͽ� ��� �Ϸ�!!");
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		} finally {
			/*
			 * close������ ���� �߻� ���� , file open�� �ȵ��� ��
			*/
			try {
				if (writer != null)
					writer.close();
			} catch (Exception e) {
				System.out.println("������ �ݴ� ���� ���� �߻�!!");
			}
		}
	}
}
