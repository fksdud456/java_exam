package swexpert2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution2 {
	static int index;
	static int[] min = new int[14];
	static boolean[][] visit;
	static int[][] core = new int[14][2];

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int Answer, i, j;
		for (int test_case = 0; test_case < T; test_case++) {
			for (i = 0; i < min.length; i++)
				min[i] = 999;
			Answer = 0;
			index = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());

			visit = new boolean[N][N];
			for (i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (j = 0; j < N; j++) {
					if (Integer.parseInt(st.nextToken()) == 1) {
						visit[i][j] = true;
					}
				}
			}

			for (i = 1; i < N - 1; i++) {
				for (j = 1; j < N - 1; j++) {
					if (visit[i][j]) {
						core[index][0] = i;
						core[index][1] = j;
						index++;
					}
				}
			}

			dfs(0, 0, 0);
			i = 13;
			while (min[i] == 999)
				i--;

			Answer = min[i];
			System.out.println("#" + (test_case + 1) + " " + Answer);
		}
	}

	public static void dfs(int depth, int count, int sum) {
		if (index == depth) {
			if (min[count] < sum)
				return;
			min[count] = sum;
			return;
		}

		int x = core[depth][0];
		int y = core[depth][1];
		int i, j;
		for (i = 1; i < visit.length; i++) {
			if (visit[x + i][y] == false) {
				visit[x + i][y] = true;
				if (x + i == visit.length - 1) {
					dfs(depth + 1, count + 1, sum + i);
					for (j = 1; j <= i; j++)
						visit[x + j][y] = false;
					break;
				}
			} else {
				for (j = 1; j < i; j++)
					visit[x + j][y] = false;
				break;
			}
		}

		for (i = 1; i < visit.length; i++) {
			if (visit[x][y + i] == false) {
				visit[x][y + i] = true;

				if (y + i == visit[0].length - 1) {
					dfs(depth + 1, count + 1, sum + i);
					for (j = 1; j <= i; j++)
						visit[x][y + j] = false;
					break;
				}
			} else {
				for (j = 1; j < i; j++)
					visit[x][y + j] = false;
				break;
			}
		}

		for (i = 1; i < visit.length; i++) {
			if (visit[x - i][y] == false) {
				visit[x - i][y] = true;

				if (x - i == 0) {
					dfs(depth + 1, count + 1, sum + i);
					for (j = 1; j <= i; j++)
						visit[x - j][y] = false;
					break;
				}
			} else {
				for (j = 1; j < i; j++)
					visit[x - j][y] = false;
				break;
			}
		}

		for (i = 1; i < visit.length; i++) {
			if (visit[x][y - i] == false) {
				visit[x][y - i] = true;
				if (y - i == 0) {
					dfs(depth + 1, count + 1, sum + i);
					for (j = 1; j <= i; j++)
						visit[x][y - j] = false;
					break;
				}
			} else {
				for (j = 1; j < i; j++)
					visit[x][y - j] = false;
				break;
			}
		}
		
		dfs(depth + 1, count, sum);
	}
}