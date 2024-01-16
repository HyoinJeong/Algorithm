package algo2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_S5_1316_그룹단어체커 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int result = 0;
        for(int i=0; i<N; i++) {
        	char[] input = br.readLine().toCharArray();
        	
        	HashSet<Character> set = new HashSet<>();
        	char prev = input[0];
        	boolean isOk = true;
        	set.add(prev);
        	for(int j=1; j<input.length; j++) {
        		if(prev != input[j]) {
        			prev = input[j];
        			if(set.contains(input[j])) {
        				isOk = false;
        				break;
        			}
        			else {
        				set.add(input[j]);
        			}
        		}
        	}
        	
        	if(isOk) {
        		result++;
        	}
        }
        
        System.out.println(result);
	}

}
