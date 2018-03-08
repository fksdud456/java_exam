package day16;

class Tour {
	enum Season {
		봄, 여름, 가을, 겨울
	}

}

public class EnumTest2 {

	public static void main(String[] args) {
		Tour.Season day[] = Tour.Season.values();
		for (Tour.Season value : day)
			System.out.println(value);

		Tour.Season season = Tour.Season.valueOf("SUMMER");
		System.out.println("Tour.Season.valueOf(\"SUMMER\"):" + season);
	}
}

