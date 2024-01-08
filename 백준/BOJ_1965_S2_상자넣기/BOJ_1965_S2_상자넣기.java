package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1965_S2_상자넣기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		
		int[] dp = new int[1001];
		st = new StringTokenizer(br.readLine());
		
		int no = Integer.parseInt(st.nextToken());
		dp[no]++;
		for(int i=1; i<n; i++) {
			no = Integer.parseInt(st.nextToken());
			
			int max = 0;
			for(int j=1; j<no; j++) {
				if(dp[j]>max) {
					max = dp[j];
				}
			}
			
			if(dp[no]<max+1) {
				dp[no] = max+1;
			}
		}
		
//		System.out.println(Arrays.toString(dp));
		int max = 0;
		for(int i=1; i<=1000; i++) {
			if(dp[i]>max) {
				max = dp[i];
			}
		}
		
		System.out.println(max);
	}

}
