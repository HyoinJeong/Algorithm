package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2012_S3_등수매기기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		int[] input = new int[N];
		
		for(int i=0; i<N; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(input);
		
		int rank = 1;
		long result = 0;
		for(int i=0; i<N; i++) {
			result+=Math.abs(input[i]-rank);
			rank++;
		}
		
		System.out.println(result);
	}

}
