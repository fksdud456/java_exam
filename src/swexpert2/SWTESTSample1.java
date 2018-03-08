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
			min = new int[N * N]; // 1���� �˻��ؼ� LINE_COMP�� ������ LINE_COMP������ �� ���ڰ� �ִ��ھ �ּұ���
			for (int i = 1; i < min.length; i++)
				min[i] = LINE_COMP;
			nowCore = 0;
			nowLine = 0;
			xList = new LinkedList<Integer>();
			yList = new LinkedList<Integer>();
			for (int i = 1; i <= N - 2; i++) { // �ھ�ã�Ƽ� ����Ʈ�� ���ʷ� �ֱ�.(�ھ� ���ȭ. �ٽ� ã�ƺ� �ʿ� ����)
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
		//���ʼ����� �˻�
		for(int y=presentY-1; y>=0; y--) {
			if(exi[presentX][y]==1 || exi[presentX][y]==2) { //�˻缿�� �ھ��̰ų� �����̸�
				for(int back=y+1; back<=presentY-1; back++) {
					exi[presentX][back] = 0; //���� ��Ҵ��� ġ���.
				}
				break; //���ʼ� �˻� ������
			}
			exi[presentX][y]=2; //�ھ ������ �ƴϹǷ� ���� ���.
			if(y==0) {//���� ��Ƽ� ���� �Ϸ�. �ھ��+1, ������
				nowCore++;
				nowLine+=presentY;
				if(min[nowCore]>nowLine) min[nowCore] = nowLine;
				if(d<xList.size()-1) findPower(xList.get(d+1),yList.get(d+1), d+1);
				for(int back=y; back<=presentY-1; back++) {
					exi[presentX][back] = 0; //���� ��Ҵ��� ġ���.
				}
				nowCore--;
				nowLine-=presentY;
			}; //findCore(������:����Y�� N-2�̸� ����X+1,1(������ ��°��) �ƴϸ� ����X,����Y+1(�ٷδ�����))		
		}
		//���ʼ� �˻�
		for(int x=presentX-1; x>=0; x--) {
			if(exi[x][presentY]==1 || exi[x][presentY]==2) {
				for(int back=x+1; back<presentX; back++) {
					exi[back][presentY] = 0;
				}
				break;
			}
			exi[x][presentY]=2;
			if(x==0) {//�ھ��+1, ������+ <==�����ؾ���
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
		//�����ʼ� �˻�
		for(int y=presentY+1; y<=N-1; y++) {
			if(exi[presentX][y]==1 || exi[presentX][y]==2) {
				for(int back=y-1; back>presentY; back--) {
					exi[presentX][back] = 0;
				}
				break;
			}
			exi[presentX][y]=2; //�ƹ��͵� �ƴϹǷ� ���� ���.
			if(y==N-1) {//���� ��Ƽ� ���� �Ϸ�. �ھ��+1, ������+ <==�����ؾ���
				nowCore++;
				nowLine += (N-1-presentY);
				if(min[nowCore]>nowLine) min[nowCore] = nowLine;
				if(d<xList.size()-1) findPower(xList.get(d+1),yList.get(d+1), d+1);
				for(int back=y; back>presentY; back--) {
					exi[presentX][back] = 0;
				}
				nowCore--;
				nowLine -= (N-1-presentY);
			}; //findCore(������ ��°��). ������ ������ ���������Ƿ� �����ھ��� �������� �ھ����.�׳����.
		}
		//�Ʒ��ʼ� �˻�
		for(int x=presentX+1; x<=N-1; x++) {
			if(exi[x][presentY]==1 || exi[x][presentY]==2) {
				for(int back=x-1; back>presentX; back--) {
					exi[back][presentY] = 0;
				}
				break;
			}
			exi[x][presentY]=2;
			if(x==N-1) {//�ھ��+1, ������+ <==�����ؾ���
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