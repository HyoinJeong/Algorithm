import java.io.*;
import java.util.*;

public class BOJ_11478_S3_¼­·Î´Ù¸¥ºÎºĞ¹®ÀÚ¿­ÀÇ°³¼ö{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		for(int i=1; i<=S.length(); i++) { // ë¶€ë¶?ë¬¸ì??ê°œìˆ˜
			for(int j=0; j<S.length(); j++) {
				int index = j+i; // ì¶”ì¶œ??ë¶€ë¶?ë¬¸ì?´ì˜ ë§ˆì?ë§??¸ë±??
				if(index>S.length()) { // ë¬¸ì??ê¸¸ì´ë¥?ì´ˆê³¼????
					break;
				}
				String subStr = S.substring(j, index);
				set.add(subStr);
			}
		}
		
		System.out.println(set.size());
	}

}
