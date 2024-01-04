package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_14002_G4_가장긴증가하는부분수열4 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringBuffer sb = new StringBuffer();

		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int[] dp = new int[N];

		st = new StringTokenizer(in.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int max = 0;

		for (int i = 0; i < N; i++) {
			dp[i] = 1; // 자신만 끝에 세웠을 경우 1의 길이

			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
			max = Math.max(max, dp[i]);
		}
		
		sb.append(max).append("\n");
		
		Stack<Integer> stack = new Stack<>();
		for(int i=N-1; i>=0; i--) {
			if(dp[i] == max) {
				stack.push(arr[i]);
				max--;
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}
		
		System.out.println(sb.toString());

	}

}
