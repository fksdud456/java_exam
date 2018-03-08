package swexpert2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DesertCafe {
	static int Answer;
	static int[][] map;
	static int[][] dir = { { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, +1 } };
	static boolean[] count = new boolean[101];
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N, i, j;
		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {
			N = sc.nextInt();
			Answer = -1;
			map = new int[N][N];

			for (i = 0; i < N; i++) {
				for (j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			for (i = 0; i < N; i++) {
				for (j = 0; j < N; j++) {
					solve(i, j);
				}
			}
			System.out.println("#" + (test_case + 1) + " " + Answer);
		}
	}

	public static void solve(int x, int y) {
		int tempX, tempY;
		int tempX1, tempY1;
		int tempX2, tempY2;
		int i;
		boolean check;
		for (int a = map.length - 1; a > 0; a--) {
			for (int b = map.length - 1; b > 0; b--) {
				if((a + b) * 2 < Answer)
					return;
			
				tempX = x + dir[0][0] * a;
				tempY = y + dir[0][1] * a;
				if (tempX < 0 || tempX >= map.length || tempY < 0 || tempY >= map.length)
					break;

				tempX1 = tempX + dir[1][0] * b;
				tempY1 = tempY + dir[1][1] * b;

				if (tempX1 < 0 || tempX1 >= map.length || tempY1 < 0 || tempY1 >= map.length)
					continue;

				tempX2 = tempX1 + dir[2][0] * a;
				tempY2 = tempY1 + dir[2][1] * a;
				if (tempX2 < 0 || tempX2 >= map.length || tempY2 < 0 || tempY2 >= map.length)
					continue;

				Arrays.fill(count, false);
				check = false;
				for (i = 0; i <= a; i++) {
					if (count[map[x + dir[0][0] * i][y + dir[0][1] * i]] == true) {
						check = true;
						break;
					}
					count[map[x + dir[0][0] * i][y + dir[0][1] * i]] = true;
				}

				if (check)
					break;

				for (i = 1; i <= b; i++) {
					if (count[map[tempX + dir[1][0] * i][tempY + dir[1][1] * i]] == true) {
						check = true;
						break;
					}
					count[map[tempX + dir[1][0] * i][tempY + dir[1][1] * i]] = true;
				}

				if (check)
					continue;

				for (i = 1; i <= a; i++) {
					if (count[map[tempX1 + dir[2][0] * i][tempY1 + dir[2][1] * i]] == true) {
						check = true;
						break;
					}
					count[map[tempX1 + dir[2][0] * i][tempY1 + dir[2][1] * i]] = true;
				}

				if (check)
					continue;

				for (i = 1 ; i < b; i++) {
					if (count[map[tempX2 + dir[3][0] * i][tempY2 + dir[3][1] * i]] == true) {
						check = true;
						break;
					}
					count[map[tempX2 + dir[3][0] * i][tempY2 + dir[3][1] * i]] = true;
				}

				if (check)
					continue;
				
				if(Answer < (a + b) * 2) {
					Answer =  (a + b) * 2;
				}
				else {
					return;	
				}
				
			}
		}
	}

}
