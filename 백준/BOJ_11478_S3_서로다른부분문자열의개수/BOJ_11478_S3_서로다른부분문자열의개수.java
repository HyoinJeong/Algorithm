import java.io.*;
import java.util.*;

public class BOJ_11478_S3_���δٸ��κй��ڿ��ǰ���{

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		for(int i=1; i<=S.length(); i++) { // 부�?문자??개수
			for(int j=0; j<S.length(); j++) {
				int index = j+i; // 추출??부�?문자?�의 마�?�??�덱??
				if(index>S.length()) { // 문자??길이�?초과????
					break;
				}
				String subStr = S.substring(j, index);
				set.add(subStr);
			}
		}
		
		System.out.println(set.size());
	}

}
