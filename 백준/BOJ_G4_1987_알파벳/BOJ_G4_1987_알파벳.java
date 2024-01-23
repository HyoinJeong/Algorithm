package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_G4_1987_알파벳 {
	public static int R;
	public static int C;
	public static int[][] map;
	public static boolean[] isVisited;
	public static int[] dx = {0,0,1,-1};
	public static int[] dy = {1,-1,0,0};
	public static int result;

	private static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		map = new int[R][C];
		for(int i=0; i<R; i++) {
			char[] alphabet = in.readLine().toCharArray();
			for(int j=0; j<C; j++) {
				map[i][j]=alphabet[j]-65;
			}
		}

		isVisited = new boolean[26];
		
		// 회전 연산의 순서는 임의로 선택이 가능하므로 순열 사용
		dfs(0,0,1);

		System.out.println(result);
	}

	private static void dfs(int x, int y, int depth) {

		isVisited[map[x][y]]=true;
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && nx<R && ny>=0 && ny<C &&!isVisited[map[nx][ny]]) {
				isVisited[map[nx][ny]]=true;
				dfs(nx,ny,depth+1);
				isVisited[map[nx][ny]]=false;
			}
		}
		
		result = Math.max(result, depth);
	}

	

}