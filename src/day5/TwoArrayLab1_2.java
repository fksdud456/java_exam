package day5;
public class TwoArrayLab1_2 {
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
		int fox_i = 0;
		int fox_j = 0;
		/*
		 * R�� �䳢�̰� F�� �����
		 * ����� ���찡 �����ϴ� ��ġ���� �밢���� 
		 * �������θ� �̵� �����ϴ�. (3,3)
		 * ���� ���� 2���� �迭 �����Ϳ���
		 * �䳢�� ��� ��ڴ°�?
		 * 
		 * �� ���̳� �� Ž�� �Ŀ� ���ڿ� ���ؼ� catchNum�ø��� �ɵ�??? �³�?
		 *
		 * ��6*6
		 */
		
		//����ã��
		re: for (int i = 0; i < play.length; i++) {
				for (int j = 0; j < play[0].length; j++) {
					if(play[i][j]=='F'){
						fox_i=i;
						fox_j=j;
						break re;
				}
			}
		}
		
		//���� Ž��
		for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {							
				//���ʴ밢�� Ž��, i�� j�� ����.
				if(i==j){
					if(play[i][j]=='R'){
						catchNum++;
					}
				}
				//�����밢�� Ž��, i+j�� �ѱ��̶� ����. 
				else if((i+j)==play.length){
					if(play[i][j]=='R'){
						catchNum++;
					}
				}
				
				//���̳� �� Ž��
				else if(i==fox_i || j==fox_j)
					if(play[i][j]=='R'){
						catchNum++;
					}
				}
			}
		System.out.printf("����� �䳢�� %d ���� ��´�.", catchNum);		
	}
}