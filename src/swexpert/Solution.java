package swexpert;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int Answer, index, max_count;
	static int[] min = new int[14];
	static final int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	static boolean[][] visit;
	static int[][] core = new int[14][2];

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("c:\\iotest\\input.txt"));
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int T = Integer.parseInt(br.readLine());

		for (int test_case = 0; test_case < T; test_case++) {
			for(int i =0 ;  i < 14; i++)
                min[i] = 999;
			
			Answer = 0;
			index = 0;
			max_count = 0;
			
            StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[][] map = new int[N][N];
			visit = new boolean[N][N];

			for (int i = 0; i < map.length; i++) {
                st = new StringTokenizer(br.readLine());

				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 1) {
						visit[i][j] = true;
						core[index][0] = i;
						core[index][1] = j;
						index++;
					}
				}
			}

			dfs(0, 0, 0);
			int i = 13;
			while(min[i] == 999){
				i--;
			}
			Answer = min[i];
			System.out.println("#" + (test_case + 1) + " " + Answer);
		}
	}

	public static void dfs(int depth, int count, int sum) {
		if (index == depth) {
            if(min[count] < sum)
                    return;
			min[count] = sum;
			return;
		}
		if (core[depth][0] == 0  || core[depth][1] == 0 
            || core[depth][0] == visit.length - 1 
            || core[depth][1] == visit[0].length - 1) {
			dfs(depth + 1, count + 1, sum);
			return;
		}
        int x = core[depth][0];
		int y = core[depth][1];
		int i, j;
			for (i = 1; i < visit.length; i++) {
				if (visit[x+ dir[0][0] * i][y+ dir[0][1] * i] == false) {
					visit[x+ dir[0][0] * i][y+ dir[0][1] * i] = true;
                    
					if (x+ dir[0][0] * i == visit.length - 1) {
						dfs(depth + 1, count + 1, sum + i);
						for (j = 1; j <= i; j++)
							visit[x + dir[0][0] * j][y + dir[0][1] * j] = false;
						break;
					}
				}
				else {
					for (j = 1; j < i; j++)
						visit[x + dir[0][0] * j][y + dir[0][1] * j] = false;
					dfs(depth + 1, count, sum);
					break;
				}
			}
		
			for (i = 1; i < visit.length; i++) {
				if (visit[x +  dir[1][0] * i][y+ dir[1][1] * i] == false) {
					visit[x + dir[1][0] * i][y+ dir[1][1] * i] = true;

					if (y + dir[1][1] * i== visit[0].length - 1) {
						dfs(depth + 1, count + 1, sum + i);
						for (j = 1; j <= i; j++)
							visit[x + dir[1][0] * j][y + dir[1][1] * j] = false;
						break;
					}
				} else {
					for (j = 1; j < i; j++)
						visit[x + dir[1][0] * j][y+ dir[1][1] * j] = false;
					dfs(depth + 1, count, sum);
					break;
				}
			}
		
			for (i = 1; i < visit.length; i++) {
				if (visit[x+ dir[2][0] * i][y+ dir[2][1] * i] == false) {
					visit[x+ dir[2][0] * i][y+ dir[2][1] * i] = true;
	
					if (x+ dir[2][0] * i == 0) {
						dfs(depth + 1, count + 1, sum + i);
						for (j = 1; j <= i; j++)
							visit[x + dir[2][0] * j][y + dir[2][1] * j] = false;
						break;
					}
				} else {
					for (j = 1; j < i; j++)
						visit[x + dir[2][0] * j][y + dir[2][1] * j] = false;
					dfs(depth + 1, count, sum);
					break;
				}
			}

			for (i = 1; i < visit.length; i++) {
				if (visit[x + dir[3][0] * i][y+ dir[3][1] * i] == false) {
					visit[x + dir[3][0] * i][y+ dir[3][1] * i] = true;

					if (y+ dir[3][1] * i == 0) {
						dfs(depth + 1, count + 1, sum + i);
						for (j = 1; j <= i; j++)
							visit[x + dir[3][0] * j][y + dir[3][1] * j] = false;

						break;
					}
				} else {
					for (j = 1; j < i; j++)
						visit[x + dir[3][0] * j][y + dir[3][1] * j] = false;
					dfs(depth + 1, count, sum);
					break;
				}
			}


	}
}