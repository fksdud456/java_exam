package day4;

public class LottoMachine3 {

	public static void main(String[] args) {
		int check[] = new int[46];
		int lotto[] = new int[6];

		int tmp;

		for (int i = 0; i < lotto.length; i++) {
			tmp = 0;
			while (tmp == 0) {
				tmp = (int) (Math.random() * 45) + 1;

				if (check[tmp] == 0) {
					check[tmp]++;
					lotto[i] = tmp;
				} else
					tmp = 0;
			}
		}

		System.out.print("오늘의 로또번호 - ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]);
			if (i == lotto.length - 1)
				System.out.println();
			else
				System.out.print(", ");
		}
	}
}
