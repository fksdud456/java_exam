package swexpert;

import java.util.Scanner;

public class dfs {
	static boolean[][] visited;
	static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	static int[][] map;
	static int[][] core = new int[13][2];
	static int count, sum_min, index;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		while (T > 0) {
			T--;
			int N = sc.nextInt();
			map = new int[N][N];
			visited = new boolean[N][N];

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			index = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 1) {
						visited[i][j] = false;
						core[index][0] = i;
						core[index][1] = j;
						index++;
					}
				}
			}
	
			count = 0; sum_min = 0;
			dfs(0,0,0);
			
			System.out.println("#"+(T+1)+" "+sum_min);
		}

		sc.close();
	}

	private static void dfs(int depth, int cnt, int sum) {		
		if(depth == index) {
			if(count == 0)
				count = cnt;
			
			if(cnt > count) {
				count = cnt;
				sum_min = sum;
			}
			else if( cnt == count ) {
				sum_min = sum_min < sum ? sum_min: sum;
			}
			return;
		}

		int nextX = core[depth][0];
		int nextY = core[depth][1];
		int line = 0;

		for(int i = 0; i < dir.length ; i ++) {
			System.out.println(nextX+ ", "+ nextY);
			if(check(nextX, nextY, i, line) == true) {
				dfs(depth+1, cnt+1, line+ sum);
			} else{
				dfs(depth+1, cnt, line+sum);
			}
		}

	}
	
	static boolean check(int x, int y, int d, int line) {
		int[] pos = { x + dir[d][0], y + dir[d][1] };
		
		if (pos[0] < 0 || pos[0] >= map.length || pos[1] < 0 || pos[1] >= map.length) {
		}
		else {
			if (visited[pos[0]][pos[1]] == false) {
				visited[pos[0]][pos[1]] = true;
				line++;
				if (pos[0] == 0 || pos[0] == dir.length || pos[1] == 0 || pos[1] == dir.length)
					return true;
				else
					return check(pos[0],pos[1], d, line);
			}
			visited[pos[0]][pos[1]] = false;
		}
		return false;
	}
}
                               
