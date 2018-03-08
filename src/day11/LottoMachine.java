package day11;

import java.util.Random;
//������ص��ȴٿ�
class DuplicateException extends Exception {
	DuplicateException() {
		super("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�.");
	}
}

public class LottoMachine {
	private int nums[];

	public LottoMachine() {
		nums = new int[6];
	}
	public void createLottoNums() {
		Random r = new Random();
		for (int i = 0; i < nums.length; i++)
			nums[i] = r.nextInt(20) + 1;
	}
	public void checkLottoNums() throws DuplicateException {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					throw new DuplicateException();
			}
		}
	}
	public int[] getNums() {
		return nums;
	}
}
