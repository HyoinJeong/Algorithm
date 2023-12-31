import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1912_S2_연속합 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(in.readLine());
		
		int result = Integer.MIN_VALUE;
		int prevMax = Integer.parseInt(st.nextToken());
		result = Math.max(result, prevMax);

		for(int i=1; i<N; i++) {
			int no = Integer.parseInt(st.nextToken());
			int sum = prevMax+no;
			
			if(sum>no) {
				prevMax = sum;
				result = Math.max(result, prevMax);
			}
			else {
				prevMax = no;
				result = Math.max(result, prevMax);
			}
		}
		
		System.out.println(result);
	}

}
