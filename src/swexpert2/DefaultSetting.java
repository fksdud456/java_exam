package swexpert2;

import java.io.FileInputStream;
import java.util.Scanner;

public class DefaultSetting {
	static int Answer;
	static int[][] map;
	public static void main(String args[]) throws Exception {

		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("c:\\iotest\\input.txt"));
		int N, i, j;
		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			N = sc.nextInt();
			map = new int[N][N];
			
			for(i = 0 ; i < N; i++) {
				for(j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			
			System.out.println("#" + (test_case + 1) + " " + Answer);
		}
	}

}
