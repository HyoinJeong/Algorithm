package algo2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_1235_S4_학생번호 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        String[] input = new String[N];
        for(int i=0; i<N; i++) {
        	input[i] = br.readLine();
        }
        
        int k = 1;
        boolean isOk = false;
        while(!isOk) {
            HashSet<String> set = new HashSet<>();

        	for(int i=0; i<N; i++) {
        		String str = input[i].substring(input[i].length()-k, input[i].length());
        		if(set.contains(str)) {
        			k++;
        			break;
        		}
        		else {
        			set.add(str);
        			if(i == N-1) {
        				isOk = true;
        			}
        		}
        	}
        }
        
        System.out.println(k);
	}

}
