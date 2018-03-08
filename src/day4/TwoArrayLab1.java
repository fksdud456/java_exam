package day4;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},
				{ 'R', 'X', 'X', 'X', 'X', 'X'},
				{ 'X', 'X', 'R', 'X', 'X', 'X'},
				{ 'R', 'X', 'X', 'F', 'X', 'X'},
				{ 'X', 'R', 'X', 'X', 'X', 'X'},
				{ 'X', 'R', 'X', 'R', 'X', 'R'},
				};

		int catchNum = 0;
		/*
		 * R�� �䳢�̰� F�� ����� ����� ���찡 �����ϴ� ��ġ���� �밢���� �������θ� �̵� �����ϴ�. ���� ���� 2���� �迭
		 * �����Ϳ��� �䳢�� ��� ��ڴ°�?
		 * 
		 * 
		 */
		int row = 0, col = 0;
		boolean check = false;
		for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (play[i][j] == 'F') {
					row = i;
					col = j;
					check = true;
					break;
				}
			}
			if (check)
				break;
		}

		// �����̵��� ��
		for (int i = 0; i < play.length; i++) {
			if (play[i][col] == 'R')
				catchNum++;
		}

		for (int j = 0; j < play[row].length; j++) {
			if (play[row][j] == 'R')
				catchNum++;
		}

		int min = play.length < play[0].length ? play.length : play[0].length;

		for (int i = 0; i < min; i++) {

			if (row - i > 0 && col - i > 0) {
				if (play[row - i][col - i] == 'R')
					catchNum++;
			}

			if (row - i > 0 && col + i < play[row - i].length) {
				if (play[row - i][col + i] == 'R')
					catchNum++;
			}

			if (row + i < play.length && col + i < play[row + i].length) {
				if (play[row + i][col + i] == 'R')
					catchNum++;
			}

			if (row + i < play.length && col - i > 0) {
				if (play[row + i][col - i] == 'R')
					catchNum++;
			}
		}

		/*
		 * -1, -1 >0 >0 +1, +1 <play.length <play[i].length -1, +1 >0
		 * <play[i].length +1, -1 <play.length >0
		 */

		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);
	}
}
