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
		 * R은 토끼이고 F는 여우다
		 * 여우는 여우가 존재하는 위치에서 대각선과 
		 * 직선으로만 이동 가능하다. (3,3)
		 * 위와 같은 2차원 배열 데이터에서
		 * 토끼를 몇마리 잡겠는가?
		 * 
		 * 각 행이나 열 탐색 후에 문자열 비교해서 catchNum올리면 될듯??? 맞나?
		 *
		 * 총6*6
		 */
		
		//여우찾기
		re: for (int i = 0; i < play.length; i++) {
				for (int j = 0; j < play[0].length; j++) {
					if(play[i][j]=='F'){
						fox_i=i;
						fox_j=j;
						break re;
				}
			}
		}
		
		//행의 탐색
		for (int i = 0; i < play.length; i++) {
			for (int j = 0; j < play[i].length; j++) {							
				//왼쪽대각선 탐색, i랑 j가 같다.
				if(i==j){
					if(play[i][j]=='R'){
						catchNum++;
					}
				}
				//오른대각선 탐색, i+j가 총길이랑 같다. 
				else if((i+j)==play.length){
					if(play[i][j]=='R'){
						catchNum++;
					}
				}
				
				//행이나 열 탐색
				else if(i==fox_i || j==fox_j)
					if(play[i][j]=='R'){
						catchNum++;
					}
				}
			}
		System.out.printf("여우는 토끼를 %d 마리 잡는다.", catchNum);		
	}
}