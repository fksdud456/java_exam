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
		 * R�� �䳢�̰� F�� �����
		 * ����� ���찡 �����ϴ� ��ġ���� �밢���� 
		 * �������θ� �̵� �����ϴ�. 
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
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
		
		//�� �̵�
		for (int i = 0; i < play.length; i++) {
			if(play[i][foxCol]=='R'){
				catchNum++;
			}
		}
		//�� �̵�
		for (int j = 0; j < play.length; j++) {
			if(play[foxRow][j]=='R'){
				catchNum++;
			}
		}
		//����
		while((tmpRow>-1)&&(tmpCol>-1)){
			if(play[tmpRow][tmpCol]=='R'){
				catchNum++;
			}
			tmpRow--;
			tmpCol--;
		}
		//�޾�
		tmpRow = foxRow;
		tmpCol = foxCol;
		while((tmpRow<play.length)&&(tmpCol>-1)){
			if(play[tmpRow][tmpCol]=='R'){
				catchNum++;
			}
			tmpRow++;
			tmpCol--;
		}
		//����
		tmpRow = foxRow;
		tmpCol = foxCol;
		while((tmpRow>-1)&&(tmpCol<play.length)){
			if(play[tmpRow][tmpCol]=='R'){
				catchNum++;
			}
			tmpRow--;
			tmpCol++;
		}
		//����
		tmpRow = foxRow;
		tmpCol = foxCol;
		while((tmpRow<play.length)&&(tmpCol<play.length)){
			if(play[tmpRow][tmpCol]=='R'){
				catchNum++;
			}
			tmpRow++;
			tmpCol++;
		}		
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}


