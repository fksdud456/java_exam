package swexpert;

import java.io.*;
import java.util.Scanner;

public class processorFileIO {
	int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

	/*
	 * 입력의 가장 첫 줄에는 총 테스트 케이스의 개수 T가 주어지며 그 다음 줄부터 각 테스트 케이스가 주어진다.
	 * 
	 * 각 테스트 케이스의 첫 줄에는 N값이 주어지며, 다음 N줄에 걸쳐서 멕시노스의 초기 상태가 N x N 배열로 주어진다.
	 * 
	 * 0은 빈 cell을 의미하며, 1은 core를 의미하고, 그 외의 숫자는 주어지지 않는다.
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
