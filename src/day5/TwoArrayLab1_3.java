package day5;
public class TwoArrayLab1_3 {
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
		 * R�� �䳢�̰� F�� �����
		 * ����� ���찡 �����ϴ� ��ġ���� �밢���� 
		 * �������θ� �̵� �����ϴ�. 
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 */
		int x=0,y=0;
		fox: for(int i=0; i<play.length; i++){
			for(int j=0; j<play[i].length; j++){
				if(play[i][j]=='F'){
					x=i;
					y=j;
					break fox;
				}
			}
		}
		
		System.out.println("������ ��ġ: "+x+", "+y);
		//������ �밢: i+j == x+y
		//���� �밢: x-i == y-j 
		//����: j==y
		//����: i==x
		for(int i=0; i<play.length; i++){
			for(int j=0; j<play[i].length; j++){
				if(i+j==x+y && play[i][j]=='R') catchNum++;
				else if(x-i==y-j && play[i][j]=='R') catchNum++;
				else if(j==y && play[i][j]=='R') catchNum++;
				else if(i==x && play[i][j]=='R') catchNum++;
			}
		}		
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}


