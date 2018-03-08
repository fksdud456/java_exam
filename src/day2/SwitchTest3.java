package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		int score = (int) (Math.random() * 101);
		/*
		 * 90~100 이면 "x : A등급" 
		 * 80~89 이면 "x : B등급" 
		 * 70~79 이면 "x : C등급" 
		 * 60~69 이면 "x : D등급" 
		 * 59 이하이면 "x : F등급"
		 * if 문으로 구현했던 것을 switch 문으로 변환
		 */
		switch (score/10) {
		case 10:
		case 9:
			System.out.println(score + ": A 등급");
			break;
		case 8:
			System.out.println(score + ": B 등급");
			break;
		case 7:
			System.out.println(score + ": C 등급");
			break;
		case 6:
			System.out.println(score + ": D 등급");
			break;
		default:
			System.out.println(score + ": F 등급");
		}

		System.out.println("수행종료");
	}
}
