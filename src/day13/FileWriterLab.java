package day13;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileWriterLab {
	static String korDayName[] = { " ", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		int today = cal.get(Calendar.DAY_OF_WEEK);
		cal.set(1994, 0, 3);
		int birthday = cal.get(Calendar.DAY_OF_WEEK);

		try (FileWriter writer = new FileWriter("c:/iotest/lab_0109.txt");) {
			writer.write("오늘은 " + korDayName[today] + "입니다.\r\n");
			writer.write("나는 " + korDayName[birthday] + "에 태어났습니다.");
			System.out.println("수행 종료");
		} catch (IOException e) {
			System.out.println("파일로 출력할 수 없습니다.");
		}

	}

}
