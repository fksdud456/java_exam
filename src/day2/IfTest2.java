package day2;
public class IfTest2 {
	public static void main(String[] args) {
		int month = (int)(Math.random() * 12) +1;
		/*
		 *  month 값이 12,1,2 이면 "x월은 겨울"
		 *  month 값이 3,4,5 이면 "x월은 봄"
		 *  month 값이 6,7,8 이면 "x월은 여름"
		 *  month 값이 9,10,11 이면 "x월은 가을"
		 */
		if(month ==12||month == 1 || month ==2)
			System.out.println(month+"월은 겨울");
		else if(month==3||month==4||month==5)
			System.out.println(month+"월은 봄");
		else if(month==6||month==7||month==8)
			System.out.println(month+"월은 여름");
		else
			System.out.println(month+"월은 가을");
		
		System.out.println("수행종료");
	}
}
