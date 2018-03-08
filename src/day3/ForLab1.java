package day3;

public class ForLab1 {

	public static void main(String[] args) {

		int count = (int) (Math.random() * 8) + 3;
		int deco = (int) (Math.random() * 3) + 1;

		for (int i = 1; i <= count; i++) {
			switch (deco) {
			case 1:
				System.out.print('*');
				break;
			case 2:
				System.out.print('$');
				break;
			case 3:
				System.out.print('#');
				break;
			}
		}
	}

}
