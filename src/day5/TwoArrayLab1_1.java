package day5;
public class TwoArrayLab1_1 {
	public static void main(String[] args) {
		char play[][] = { 
				{ 'X', 'X', 'X', 'R', 'X', 'R'},
				{ 'R', 'X', 'X', 'X', 'X', 'X'},
				{ 'X', 'X', 'R', 'X', 'X', 'X'},
				{ 'R', 'X', 'X', 'F', 'X', 'X'},
				{ 'X', 'R', 'X', 'X', 'X', 'X'},
				{ 'X', 'R', 'X', 'R', 'X', 'R'}
				};
		int catchNum = 0;
		/*
		 * R은 토끼이고 F는 여우다
		 * 여우는 여우가 존재하는 위치에서 대각선과 
		 * 직선으로만 이동 가능하다. 
		 * 위와 같은 2차원 배열 데이터에서
		 * 토끼를 몇마리 잡겠는가?
		 */
		
		int foxRow=0;
		int foxCol=0;
		a: for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {
				if(play[i][j]=='F'){
					foxRow = i;
					foxCol = j;
					break a;
				}
			}
		}
		int tmpRow = foxRow;
		int tmpCol = foxCol;
		
		//행 이동
		for (int i = 0; i < play.length; i++) {
			if(play[i][foxCol]=='R'){
				catchNum++;
			}
		}
		//열 이동
		for (int j = 0; j < play.length; j++) {
			if(play[foxRow][j]=='R'){
				catchNum++;
			}
		}
		//왼위
		while((tmpRow>-1)&&(tmpCol>-1)){
			if(play[tmpRow][tmpCol]=='R'){
				catchNum++;
			}
			tmpRow--;
			tmpCol--;
		}
		//왼아
		tmpRow = foxRow;
		tmpCol = foxCol;
		while((tmpRow<play.length)&&(tmpCol>-1)){
			if(play[tmpRow][tmpCol]=='R'){
				catchNum++;
			}
			tmpRow++;
			tmpCol--;
		}
		//오윈
		tmpRow = foxRow;
		tmpCol = foxCol;
		while((tmpRow>-1)&&(tmpCol<play.length)){
			if(play[tmpRow][tmpCol]=='R'){
				catchNum++;
			}
			tmpRow--;
			tmpCol++;
		}
		//오아
		tmpRow = foxRow;
		tmpCol = foxCol;
		while((tmpRow<play.length)&&(tmpCol<play.length)){
			if(play[tmpRow][tmpCol]=='R'){
				catchNum++;
			}
			tmpRow++;
			tmpCol++;
		}		
		System.out.printf("여우는 토끼를 %d 마리 잡는다.", catchNum);		
	}
}


