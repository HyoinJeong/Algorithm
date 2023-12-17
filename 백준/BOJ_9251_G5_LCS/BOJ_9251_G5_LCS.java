import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9251_G5_LCS {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S1 = br.readLine();
		String S2 = br.readLine();
		
		int[][] lcs = new int[S1.length()+1][S2.length()+1];
		
		int result = 0;
		for(int i=1; i<=S1.length(); i++) {
			for(int j=1; j<=S2.length(); j++) {
				if(S1.charAt(i-1) == S2.charAt(j-1)) {
					lcs[i][j] = lcs[i-1][j-1]+1;
				}
				else {
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
			}
		}
		
		System.out.println(lcs[S1.length()][S2.length()]);

	}
}
