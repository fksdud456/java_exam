package day16;

enum SeasonInit {
	SPRING("봄"), SUMMER("여름"), FALL("가을"), WINTER("겨울");

	private final String name;

	SeasonInit(String name) {
		this.name= name;
	}

	String returnName() {
		return name;
	}

}

public class EnumTest4 {
	public static void main(String[] args) {
		SeasonInit day[] = SeasonInit.values();
		for (SeasonInit value : day)
			System.out.println(value);
		for (SeasonInit value : day)
			System.out.println(value.returnName());

		SeasonInit season = SeasonInit.valueOf("SUMMER");
		System.out.println("Seasoninit.valueOf(\"SUMMER\"):" + season);
		System.out.println("Seasoninit.valueOf(\"SUMMER\").returnName():" + season.returnName());
	}
}
