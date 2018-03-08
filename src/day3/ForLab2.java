package day3;

public class ForLab2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		for (int i = 5; i <= 20; i++) {
			if (i % 2 == 0)
				a = a * i;
			else
				b = b * i;
		}

		System.out.println("Â¦¼öÀÇ °ö :" + a);
		System.out.println("È¦¼öÀÇ °ö :" + b);
	}

}
