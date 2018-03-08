package day16;

enum Season2 {
	봄,여름, 가을, 겨울
}
public class EnumTest3 {

	public static void main(String[] args) {
		System.out.println(Season2.봄);
		System.out.println(Season2.여름);
		System.out.println(Season2.가을);
		System.out.println(Season2.겨울);
		Season2 data = Season2.가을;
		
		if(data == Season2.가을) {
			System.out.println("당신이 좋야하는 계절은 가을!!!");
		}
	}

}
