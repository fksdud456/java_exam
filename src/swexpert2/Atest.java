package swexpert2;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Atest {
	public static int Answer;
	public static int[] result;
	public static int[] temp;

	public static int[] price;
	public static int[][] cookies;

	static int N;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Scanner sc = new Scanner(new
		// FileInputStream("c:\\iotest\\input.txt"));
		// int N, i, j;

		int T = sc.nextInt();
		result = new int[26];
		temp = new int[26];
		for (int test_case = 0; test_case < T; test_case++) {
			N = sc.nextInt();

			Arrays.fill(result, 0);
			Arrays.fill(temp, 0);
			Answer = 50 * (N + 1);
			price = new int[N];
			cookies = new int[N][26];
			int k;
			String temp;
			for (int i = 0; i < N; i++) {
				price[i] = sc.nextInt();
				k = sc.nextInt();
				for(int j = 0; j < k ; j++) {
					temp = sc.next();
					cookies[i][temp.charAt(0)-65]++;
				}
			}

			System.out.println("#" + (test_case + 1) + " " + Answer);
		}
	}

	public static void dfs(int depth, int sum) {
		boolean finish = true;
		for (int i = 0; i < 26; i++) {
			if (result[i] - temp[i] > 0) {
				finish = false;
				break;
			}
		}

		if (finish) {
			Answer = Answer > sum ? sum : Answer;
			return;
		}

		if (depth == N - 1) {
			return;
		}

		for (int i = 0; i < 26; i++)
			temp[i] += cookies[depth][i];

		dfs(depth + 1, sum + price[depth]);

		for (int i = 0; i < 26; i++)
			temp[i] -= cookies[depth][i];

		dfs(depth + 1, sum);
	}
}
