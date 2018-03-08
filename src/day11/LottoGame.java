package day11;

public class LottoGame {
	public static void main(String[] args) {
		LottoMachine lotto = new LottoMachine();
		lotto.createLottoNums();
		try {
			lotto.checkLottoNums();

			int[] nums = lotto.getNums();
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i]);
				if (i < nums.length - 1)
					System.out.print(", ");
			}
		} catch (DuplicateException e) {
			System.out.println(e.getMessage());
		}

	}
}
