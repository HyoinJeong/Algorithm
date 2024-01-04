package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1189_S1_컴백홈 {

	public static int R;
	public static int C;
	public static int K;
	public static char[][] map;
	public static int[] dx = { 1, -1, 0, 0 };
	public static int[] dy = { 0, 0, -1, 1 };
	public static int result;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		map = new char[R][C];

		for (int i = 0; i < R; i++) {
			map[i] = in.readLine().toCharArray();
		}

		boolean[][] isVisited = new boolean[R][C];
		isVisited[R - 1][0] = true;
		dfs(R - 1, 0, isVisited, 1);

		System.out.println(result);
	}

	public static void dfs(int X, int Y, boolean[][] isVisited, int depth) {
		if (depth == K) {
			if (X == 0 && Y == C - 1) {
				result++;
			}
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nx = X + dx[i];
			int ny = Y + dy[i];

			if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
				if (!isVisited[nx][ny] && map[nx][ny]!='T') {
					isVisited[nx][ny] = true;
					dfs(nx, ny, isVisited, depth+1);
					isVisited[nx][ny] = false;
				}
			}
		}
	}

}
