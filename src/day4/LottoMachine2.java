package day4;

public class LottoMachine2 {

	public static void main(String[] args) {
		int lotto[] = new int[6];

		int tmp;
		for (int i = 0; i < lotto.length; i++) {
			tmp = 0;
			while (tmp == 0) {
				tmp = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[j] == tmp) {
						tmp = 0;
						break;
					}

				}
				if (tmp != 0)
					lotto[i] = tmp;
			}

		}

		System.out.print("오늘의 로또번호 - ");
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length - 1)
				System.out.print(lotto[i]);
			else
				System.out.print(lotto[i] + ", ");
		}
	}

}
