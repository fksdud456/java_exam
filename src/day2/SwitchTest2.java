package day2;
public class SwitchTest2 {
	public static void main(String[] args) {
		int month = (int)(Math.random() * 12) +1;
		/*
		 *  month 값이 12,1,2 이면 "x월은 겨울"
		 *  month 값이 3,4,5 이면 "x월은 봄"
		 *  month 값이 6,7,8 이면 "x월은 여름"
		 *  month 값이 9,10,11 이면 "x월은 가을"
		 *  if 문으로 구현했던 것을 switch 문으로 변환
		 */
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월은 겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름");
			break;
		default:
			System.out.println(month + "월은 가을");
		}
		
		System.out.println("수행종료");
	}
}
