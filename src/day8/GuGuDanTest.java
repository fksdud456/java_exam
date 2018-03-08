package day8;

import day5.MethodLab3;

class GuGu {
	private int dan;
	private int number;

	GuGu() {
	}

	GuGu(int dan) {
		this.dan = dan;
	}

	GuGu(int dan, int number) {
		this.dan = dan;
		this.number = number;
	}

	void printPart() {
		if (number == 0) {
			for (int n = 1; n <= 9; n++)
				System.out.print("\t" + dan + "*" + n + "=" + dan * n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}

class GuGuDan extends GuGu {
	GuGuDan() {

	}

	GuGuDan(int dan) {
		super(dan);
	}

	GuGuDan(int dan, int number) {
		super(dan, number);
	}

	static void printAll() {
		for (int d = 1; d <= 9; d++) {
			for (int n = 1; n <= 9; n++) {
				System.out.print("\t" + d + "*" + n + "=" + d * n);
			}
			System.out.println();
		}
	}
}

public class GuGuDanTest {

	public static void main(String[] args) {
		int dan = MethodLab3.getRandom(20);
		int num = MethodLab3.getRandom(20);

		GuGuDan gugudan;
		if (dan <= 9) {
			if (num <= 9) {
				gugudan = new GuGuDan(dan, num);
				System.out.print(dan + " * " + num + " = ");
			} else {
				gugudan = new GuGuDan(dan);
				System.out.print(dan + "´Ü : ");
			}
			gugudan.printPart();
		} else {
			GuGuDan.printAll();
		}
	}

}
