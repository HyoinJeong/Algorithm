package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932_S1_정수삼각형 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
//		int[][] map = new int[n][n];
		int[][] dp = new int[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=i; j++) {
				dp[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
			}
		}
		
		int max = 0;
		for(int i=1; i<=n; i++) {
			max = Math.max(max, dp[n][i]);
		}
		
		System.out.println(max);
	}

}
