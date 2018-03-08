package day3;

public class ForTest4 {

	public static void main(String[] args) {
		System.out.println("구구단");

		for (int dan = 1; dan <= 9; dan++) {
			System.out.print(dan + "단 : ");
			for (int num = 1; num <= 9; num++) {
				System.out.print(/*dan + "x" + num + "=" + */dan*num + "\t");
			}
			System.out.println();
		}

	}
}
