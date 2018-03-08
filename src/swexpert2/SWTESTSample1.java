package swexpert2;

import java.util.LinkedList;
import java.util.Scanner;
public class SWTESTSample1 {
	static int Answer;
	static int[][] exi;
	static int N;
	static int min[];
	static int nowCore;
	static int nowLine;
	static LinkedList<Integer> xList;
	static LinkedList<Integer> yList;

	static final int LINE_COMP = 100000;

	public static void main(String args[]) throws Exception{
		int T;
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			N = sc.nextInt();
			exi = new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					exi[i][j] = sc.nextInt();
				}
			}
			min = new int[N * N]; // 1부터 검사해서 LINE_COMP가 나오면 LINE_COMP나오기 전 숫자가 최대코어에 최소길이
			for (int i = 1; i < min.length; i++)
				min[i] = LINE_COMP;
			nowCore = 0;
			nowLine = 0;
			xList = new LinkedList<Integer>();
			yList = new LinkedList<Integer>();
			for (int i = 1; i <= N - 2; i++) { // 코어찾아서 리스트에 차례로 넣기.(코어 노드화. 다시 찾아볼 필요 없이)
				for (int j = 1; j <= N - 2; j++) {
					if (exi[i][j] == 1) {
						xList.add(i);
						yList.add(j);
					}
				}
			}
			findPower(xList.get(0), yList.get(0),0);
			
			
			for(int i=1; i<min.length; i++) {
				if(min[i]==LINE_COMP) {
					Answer=min[i-1];
					break;
				}
			}
			System.out.println("#"+(test_case+1)+" "+Answer);
		}
	}
	
	static void findPower(int presentX, int presentY, int d) {
		//왼쪽셀부터 검사
		for(int y=presentY-1; y>=0; y--) {
			if(exi[presentX][y]==1 || exi[presentX][y]==2) { //검사셀이 코어이거나 전선이면
				for(int back=y+1; back<=presentY-1; back++) {
					exi[presentX][back] = 0; //전선 깔았던거 치우기.
				}
				break; //왼쪽셀 검사 끝내기
			}
			exi[presentX][y]=2; //코어나 전선이 아니므로 전선 깔기.
			if(y==0) {//전원 닿아서 연결 완료. 코어갯수+1, 전선합
				nowCore++;
				nowLine+=presentY;
				if(min[nowCore]>nowLine) min[nowCore] = nowLine;
				if(d<xList.size()-1) findPower(xList.get(d+1),yList.get(d+1), d+1);
				for(int back=y; back<=presentY-1; back++) {
					exi[presentX][back] = 0; //전선 깔았던거 치우기.
				}
				nowCore--;
				nowLine-=presentY;
			}; //findCore(다음셀:현재Y가 N-2이면 현재X+1,1(다음줄 둘째셀) 아니면 현재X,현재Y+1(바로다음셀))		
		}
		//위쪽셀 검사
		for(int x=presentX-1; x>=0; x--) {
			if(exi[x][presentY]==1 || exi[x][presentY]==2) {
				for(int back=x+1; back<presentX; back++) {
					exi[back][presentY] = 0;
				}
				break;
			}
			exi[x][presentY]=2;
			if(x==0) {//코어갯수+1, 전선합+ <==구현해야함
				nowCore++;
				nowLine+=presentX;
				if(min[nowCore]>nowLine) min[nowCore] = nowLine;
				if(d<xList.size()-1) findPower(xList.get(d+1),yList.get(d+1), d+1);
				for(int back=x; back<presentX; back++) {
					exi[back][presentY] = 0;
				}
				nowCore--;
				nowLine-=presentX;
			};
		}
		//오른쪽셀 검사
		for(int y=presentY+1; y<=N-1; y++) {
			if(exi[presentX][y]==1 || exi[presentX][y]==2) {
				for(int back=y-1; back>presentY; back--) {
					exi[presentX][back] = 0;
				}
				break;
			}
			exi[presentX][y]=2; //아무것도 아니므로 전선 깔기.
			if(y==N-1) {//전원 닿아서 연결 완료. 코어갯수+1, 전선합+ <==구현해야함
				nowCore++;
				nowLine += (N-1-presentY);
				if(min[nowCore]>nowLine) min[nowCore] = nowLine;
				if(d<xList.size()-1) findPower(xList.get(d+1),yList.get(d+1), d+1);
				for(int back=y; back>presentY; back--) {
					exi[presentX][back] = 0;
				}
				nowCore--;
				nowLine -= (N-1-presentY);
			}; //findCore(다음줄 둘째셀). 오른쪽 전원에 연결했으므로 현재코어의 오른쪽은 코어없음.그냥통과.
		}
		//아래쪽셀 검사
		for(int x=presentX+1; x<=N-1; x++) {
			if(exi[x][presentY]==1 || exi[x][presentY]==2) {
				for(int back=x-1; back>presentX; back--) {
					exi[back][presentY] = 0;
				}
				break;
			}
			exi[x][presentY]=2;
			if(x==N-1) {//코어갯수+1, 전선합+ <==구현해야함
				nowCore++;
				nowLine += (N-1-presentX);
				if(min[nowCore]>nowLine) min[nowCore] = nowLine;
				if(d<xList.size()-1) findPower(xList.get(d+1),yList.get(d+1), d+1);
				for(int back=x; back>presentX; back--) {
					exi[back][presentY] = 0;
				}
				nowCore--;
				nowLine -= (N-1-presentX);
			};
		}
		if(d<xList.size()-1) findPower(xList.get(d+1),yList.get(d+1), d+1);
	}
}