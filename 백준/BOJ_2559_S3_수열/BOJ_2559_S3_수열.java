import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2559_S3_수열 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] dp = new int[N+1];
		int result = Integer.MIN_VALUE;

		st = new StringTokenizer(in.readLine());
		for(int i=1; i<=N; i++) {
			int no = Integer.parseInt(st.nextToken());
			dp[i] = dp[i-1]+no;
			if(i>=K) {
				int sum = dp[i] - dp[i-K];
				result = Math.max(result,sum);
			}
		}
		
		System.out.println(result);
		
	}

}
