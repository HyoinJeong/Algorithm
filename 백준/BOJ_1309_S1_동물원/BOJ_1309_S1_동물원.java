import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1309_S1_동물원 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		// dp[i][j] : i번째 줄의 j번째 칸에 동물을 놓을 수 있는 경우의 수
		// j = 0 : 아무 동물도 놓지 않음
		// j = 1 : 첫 번째 칸에 동물을 놓음
		// j = 2 : 두 번째 칸에 동물을 놓음
		int[][] dp = new int[N][3];
		dp[0][0] = dp[0][1] = dp[0][2] = 1;

		for (int i = 1; i < N; i++) {
			dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
			dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
			dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
		}

		System.out.println((dp[N - 1][0] + dp[N - 1][1] + dp[N - 1][2]) % 9901);
	}
}
