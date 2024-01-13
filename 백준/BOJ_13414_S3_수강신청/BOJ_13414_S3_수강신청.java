package algo2024;

import java.io.*;
import java.util.*;

public class BOJ_13414_S3_수강신청 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());

		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for(int i=0; i<L; i++) {
			String no = br.readLine();
			if(set.contains(no)) {
				set.remove(no);
			}
			set.add(no);
		}
		
		int count = 0;
		for(String no : set) {
			if(count == K) {
				break;
			}
			sb.append(no).append("\n");
			count++;
		}
		
		System.out.println(sb);
	}

}
