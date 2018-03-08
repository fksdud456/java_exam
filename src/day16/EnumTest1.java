package day16;

enum Season {
	SPRING, SUMMER, FALL, WINTER
}
public class EnumTest1 {

	public static void main(String[] args) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		Season data = Season.FALL;
		
		if(data == Season.FALL) {
			System.out.println("당신이 좋야하는 계절은 가을!!!");
		}
	}

}
