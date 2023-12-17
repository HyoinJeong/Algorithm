import java.util.*;
import java.io.*;

public class BOJ_5582_G5_공통부분문자열 {

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
					result = Math.max(result, lcs[i][j]);
				}
			}
		}
		
		System.out.println(result);

	}

}
