package day2;
public class SwitchTest1 {
	public static void main(String[] args) {
		int grade = (int)(Math.random()*6)+1;
		switch (grade) {
		case 4:
		case 5:
		case 6:
				System.out.println(grade+"학년은 고학년입니다");
				break;
		default :
				System.out.println(grade+"학년은 저학년입니다");
		}
	}
}
