package day8;

import java.util.*;

public class KoreanDay {
	public static String day;
	static String korDayName[] = { 
			" " , "�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"
	};
	
	static {
		GregorianCalendar cal = new GregorianCalendar();
		int numDay = cal.get(Calendar.DAY_OF_WEEK);
		day = korDayName[numDay];
	}
	public static void main(String[] args) {
	

	}

}
