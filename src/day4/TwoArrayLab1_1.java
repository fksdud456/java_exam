package day4;

public class TwoArrayLab1_1 {

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
		 * R은 토끼이고 F는 여우다 여우는 여우가 존재하는 위치에서 대각선과 직선으로만 이동 가능하다. 위와 같은 2차원 배열
		 * 데이터에서 토끼를 몇마리 잡겠는가?
		 * 
		 * 
		 */
		int row = 0, col = 0;
		a: for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if (play[i][j] == 'F') {
					row = i;
					col = j;
					break a;
				}
			}
			}
		
		// 직선이동할 때
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
			if(row - i > 0 && col - i > 0) {
				if (play[row -i][col -i] == 'R')
					catchNum++;
			}
		
			if(row - i > 0 && col + i < play[row-i].length) {
				if (play[row -i][col +i] == 'R')
					catchNum++;
			}
			
			if(row + i <play.length && col + i <play[row+i].length) {
				if (play[row +i][col +i] == 'R')
					catchNum++;
			}
			
			if(row + i <play.length && col - i > 0) {
				if (play[row+i][col -i] == 'R')
					catchNum++;
			}
		}
		
		/*
		 * -1, -1  >0 >0
		 * +1, +1  <play.length <play[i].length
		 * -1, +1  >0 <play[i].length
		 * +1, -1  <play.length  >0
		 */

		System.out.printf("여우는 토끼를 %d 마리 잡는다.", catchNum);
	}
}
