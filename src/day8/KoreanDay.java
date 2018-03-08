package day8;

import java.util.*;

public class KoreanDay {
	public static String day;
	static String korDayName[] = { 
			" " , "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"
	};
	
	static {
		GregorianCalendar cal = new GregorianCalendar();
		int numDay = cal.get(Calendar.DAY_OF_WEEK);
		day = korDayName[numDay];
	}
	public static void main(String[] args) {
	

	}

}
