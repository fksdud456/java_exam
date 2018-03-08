package swexpert2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
각 테스트 케이스의 첫 번째 줄에는 디저트 카페가 모여있는 지역의 한 변의 길이 N이 주어진다.
그 다음 N 줄에는 N * N 크기의 디저트 카페에서 팔고 있는 디저트 종류에 대한 정보가 주어진다.
*/
public class DesertCafe2 {
	static int Answer;
	static int[][] map;
	static int[][] dir = { { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, +1 } };
	static boolean[] count = new boolean[101];
	
	public static void main(String args[]) throws Exception {

		// Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new FileInputStream("c:\\iotest\\input.txt"));
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
		boolean check;
		for (int a = map.length - 1; a > 0; a--) {
			for (int b = map.length - 1; b > 0; b--) {
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
					break;

				Arrays.fill(count, false);
				check = false;
				for (int i = 0; i <= a; i++) {
					if (count[map[x + dir[0][0] * i][y + dir[0][1] * i]] == true) {
						check = true;
						break;
					}
					count[map[x + dir[0][0] * i][y + dir[0][1] * i]] = true;
				}

				if (check)
					break;

				for (int i = 1; i <= b; i++) {
					if (count[map[tempX + dir[1][0] * i][tempY + dir[1][1] * i]] == true) {
						check = true;
						break;
					}
					count[map[tempX + dir[1][0] * i][tempY + dir[1][1] * i]] = true;
				}

				if (check)
					break;

				for (int i = 1; i <= a; i++) {
					if (count[map[tempX1 + dir[2][0] * i][tempY1 + dir[2][1] * i]] == true) {
						check = true;
						break;
					}
					count[map[tempX1 + dir[2][0] * i][tempY1 + dir[2][1] * i]] = true;
				}

				if (check)
					break;

				for (int i = 1 ; i < b; i++) {
					if (count[map[tempX2 + dir[3][0] * i][tempY2 + dir[3][1] * i]] == true) {
						check = true;
						break;
					}
					count[map[tempX2 + dir[3][0] * i][tempY2 + dir[3][1] * i]] = true;
				}


				if (check)
					break;
				/*System.out.println(" - ");*/
				/*System.out.println(x+", " + y+ " ---- "+a + ", "+ b);*/
				Answer = Answer > (a + b) * 2 ? Answer : (a + b) * 2;
				return;
			}
		}
	}

}
