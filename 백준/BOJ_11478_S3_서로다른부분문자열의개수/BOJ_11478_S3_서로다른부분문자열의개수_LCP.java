import java.io.*;
import java.util.*;

public class BOJ_11478_S3_서로다른부분문자열의개수_LCP {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
        String[] suffixArray = new String[str.length()];
        int[] LCP = new int[str.length()];

        for (int i = 0; i < str.length(); i++) suffixArray[i] = str.substring(i);

        Arrays.sort(suffixArray);
        LCP[0] = 0;
        for (int i = 1; i < str.length(); i++) {
            String prev = suffixArray[i - 1];
            String cur = suffixArray[i];
            int j = 0;
            while (j < prev.length() && j < cur.length() && prev.charAt(j) == cur.charAt(j)) j++;
            LCP[i] = j;
        }

        int subCnt = 0;
        for (int i = 0; i < str.length(); i++) {
            subCnt += suffixArray[i].length() - LCP[i];
            // 사전순으로 k번째 부분문자열 출력
//            if(subCnt >= k) {
//                System.out.printf("#%d %s\n", t, suffixArray[i].substring(0, suffixArray[i].length() - (subCnt - k)));
//                break;
//            }
        }
        System.out.println(subCnt);
	}

}
