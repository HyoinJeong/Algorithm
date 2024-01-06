package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class BOJ_9081_S1_단어맞추기 {

	public static List<String> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			String s = br.readLine();
			char[] arr = s.toCharArray();
			
			int target = -1;
			for(int i=s.length()-1; i>=1; i--) {
				if(s.charAt(i)>s.charAt(i-1)) {
					target = i-1;
					break;
				}
			}
			
			if(target == -1) {
				sb.append(s).append("\n");
			}
			else {
				int index = s.length()-1;
				char min = Character.MAX_VALUE;
				for(int i=s.length()-1; i>target; i--) {
					if(s.charAt(i)>s.charAt(target) && s.charAt(i)<min) {
						min = s.charAt(i);
						index = i;
					}
				}
				
				char temp = arr[target];
				arr[target] = arr[index];
				arr[index] = temp;
				
				char[] frontArr = new char[target];
				frontArr = Arrays.copyOfRange(arr, 0, target+1);
				
				char[] backArr = new char[s.length()-target];
				backArr = Arrays.copyOfRange(arr, target+1, s.length());
				Arrays.sort(backArr);
				
				sb.append(String.valueOf(frontArr)+String.valueOf(backArr)).append("\n");
				
			}
		}

		System.out.println(sb.toString());
	}

}
