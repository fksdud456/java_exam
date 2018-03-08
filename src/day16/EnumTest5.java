package day16;

public class EnumTest5 {

	public static void main(String[] args) {
		SeasonInit input = SeasonInit.FALL;
		
		switch(input) {
		case SPRING:
			System.out.println(input.returnName());
			break;
		case SUMMER:
			System.out.println(input.returnName());
			break;
			case FALL:
			System.out.println(input.returnName());
			break;
			case WINTER:
				System.out.println(input.returnName());
			break;

	}

}
}