package swexpert;

import java.io.*;
import java.util.Scanner;

public class processorFileIO {
	int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	/*
	 * �Է��� ���� ù �ٿ��� �� �׽�Ʈ ���̽��� ���� T�� �־����� �� ���� �ٺ��� �� �׽�Ʈ ���̽��� �־�����.
	 * 
	 * �� �׽�Ʈ ���̽��� ù �ٿ��� N���� �־�����, ���� N�ٿ� ���ļ� �߽ó뽺�� �ʱ� ���°� N x N �迭�� �־�����.
	 * 
	 * 0�� �� cell�� �ǹ��ϸ�, 1�� core�� �ǹ��ϰ�, �� ���� ���ڴ� �־����� �ʴ´�.
	 */

	public static void main(String[] args) {
		File f = new File("c:\\1.txt");
		Scanner sc = new Scanner(System.in);
		int[][] map;

		int T = sc.nextInt();
		while (T > 0) {
			T--;
			int N = sc.nextInt();
			map = new int[N][N];

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			for (int[] list : map) {
				for (int data : list) {

				}
			}
		}

	}

}
