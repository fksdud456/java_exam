package swexpert;

import java.util.*;

public class processor {
	static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
	static int[][] map;
	static boolean[][] checkMap;
	static int[][] core = new int[13][2];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
/*		int[][] core = new int[13][2];
*/
		int T = sc.nextInt();
		while (T > 0) {
			T--;
			int N = sc.nextInt();
			map = new int[N][N];
			checkMap = new boolean[N][N];

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = sc.nextInt();
				}
			}

			int index = 0;
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 1) {
						checkMap[i][j] = true;
						core[index][0] = i;
						core[index][1] = j;
						index++;
					}
				}
			}

			int cnt = 0, tmpsum = 0, sum = 0;
			for (int[] temp : core) {
				for (int i = 0; i < dir.length; i++) {
					if (temp[0] == 0 || temp[0] == dir.length || temp[1] == 0 || temp[1] == dir.length)
						cnt++;
					else {
						tmpsum = sol(temp[0], temp[1], i, cnt);
						sum = tmpsum > sum ? sum : tmpsum;						
					}
				}
			}
			
			System.out.println("#"+T+" "+sum);
		}

		sc.close();
	}

	public static int sol(int x, int y, int d, int cnt) {
		
		{
			//dir0
			for(int[] temp : core) {
				sol(temp[0]+ dir[d][0], temp[1]+ dir[d][1], d, cnt);
			}
		}
		{
			//dir1
		}
		
		//dir2
		
		//dir3
		int sum = 0;
		int[] pos = { x + dir[d][0], y + dir[d][1] };
		
		if (pos[0] >= 0 || pos[0] <= map.length || pos[1] >= 0 || pos[1] <= map.length) {
			return 0;	
		}
		else {		
			
			if (checkMap[pos[0]][pos[1]] == false) {
				checkMap[pos[0]][pos[1]] = true;
				sum++;
				if (pos[0] == 0 || pos[0] == dir.length || pos[1] == 0 || pos[1] == dir.length) {
					cnt++;
					return sum;
				}
				else
					return sum + sol(pos[0],pos[1], d, cnt);
			}
			checkMap[pos[0]][pos[1]] = false;
			return 0;
		}
	}
	
	public static boolean check(int x, int y, int d, int line) {
		int[] pos = { x + dir[d][0], y + dir[d][1] };
		
		if (pos[0] < 0 || pos[0] >= map.length || pos[1] < 0 || pos[1] >= map.length) {
		}
		else {
			if (checkMap[pos[0]][pos[1]] == false) {
				checkMap[pos[0]][pos[1]] = true;
				line++;
				if (pos[0] == 0 || pos[0] == dir.length || pos[1] == 0 || pos[1] == dir.length)
					return true;
				else
					return check(pos[0],pos[1], d, line);
			}
			checkMap[pos[0]][pos[1]] = false;
		}
		return false;
	}
}
