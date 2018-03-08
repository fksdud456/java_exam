package day13;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileWriterLab {
	static String korDayName[] = { " ", "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����" };

	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		int today = cal.get(Calendar.DAY_OF_WEEK);
		cal.set(1994, 0, 3);
		int birthday = cal.get(Calendar.DAY_OF_WEEK);

		try (FileWriter writer = new FileWriter("c:/iotest/lab_0109.txt");) {
			writer.write("������ " + korDayName[today] + "�Դϴ�.\r\n");
			writer.write("���� " + korDayName[birthday] + "�� �¾���ϴ�.");
			System.out.println("���� ����");
		} catch (IOException e) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}

	}

}
