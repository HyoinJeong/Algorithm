import java.io.*;
import java.util.*;

public class BOJ_11478_S3_서로다른부분문자열의개수{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		for(int i=1; i<=S.length(); i++) { // 遺�遺?臾몄옄??媛쒖닔
			for(int j=0; j<S.length(); j++) {
				int index = j+i; // 異붿텧??遺�遺?臾몄옄?댁쓽 留덉?留??몃뜳??
				if(index>S.length()) { // 臾몄옄??湲몄씠瑜?珥덇낵????
					break;
				}
				String subStr = S.substring(j, index);
				set.add(subStr);
			}
		}
		
		System.out.println(set.size());
	}

}
