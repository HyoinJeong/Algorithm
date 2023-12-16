import java.io.*;
import java.util.*;

public class BOJ_5582_G5_공통부분문자열 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		HashSet<String> set = new HashSet<>();
		for(int i=1; i<=S.length(); i++) { // 부분 문자열 개수
			for(int j=0; j<S.length(); j++) {
				int index = j+i; // 추출할 부분 문자열의 마지막 인덱스
				if(index>S.length()) { // 문자열 길이를 초과할 때
					break;
				}
				String subStr = S.substring(j, index);
				set.add(subStr);
			}
		}
		
		System.out.println(set.size());
	}

}
