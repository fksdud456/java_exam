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
		 * R은 토끼이고 F는 여우다
		 * 여우는 여우가 존재하는 위치에서 대각선과 
		 * 직선으로만 이동 가능하다. 
		 * 위와 같은 2차원 배열 데이터에서
		 * 토끼를 몇마리 잡겠는가?
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
		
		System.out.println("여우의 위치: "+x+", "+y);
		//오른쪽 대각: i+j == x+y
		//왼쪽 대각: x-i == y-j 
		//세로: j==y
		//가로: i==x
		for(int i=0; i<play.length; i++){
			for(int j=0; j<play[i].length; j++){
				if(i+j==x+y && play[i][j]=='R') catchNum++;
				else if(x-i==y-j && play[i][j]=='R') catchNum++;
				else if(j==y && play[i][j]=='R') catchNum++;
				else if(i==x && play[i][j]=='R') catchNum++;
			}
		}		
		System.out.printf("여우는 토끼를 %d 마리 잡는다.", catchNum);		
	}
}


