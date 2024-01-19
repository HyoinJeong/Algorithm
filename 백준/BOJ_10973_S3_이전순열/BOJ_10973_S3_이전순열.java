package algo2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BOJ_10973_S3_이전순열 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(st.nextToken());
        int[] input = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
        	input[i] = Integer.parseInt(st.nextToken());
        }
        
        boolean isFirst = true;
        int index = N-1;
        for(int i=N-1; i>0; i--) {
        	if(input[i]<input[i-1]) {
        		index = i-1;
        		// 해당 인덱스 이우 중에 가장 작은 값 찾기
        		int max = Integer.MIN_VALUE;
        		int maxIndex = N-1;
        		for(int j=index+1; j<N; j++) {
        			if(input[j]<input[index] && max<input[j]) {
        				max = input[j];
        				maxIndex = j;
        			}
        		}
        		int temp = input[index];
        		input[index] = max;
        		input[maxIndex] = temp;
        		
        		// 해당 인덱스 이후 배열 정렬
        		int[] back = Arrays.copyOfRange(input, index+1, N);
        		
        		for(int j=0; j<=index; j++) {
        			sb.append(input[j]).append(" ");
        		}
        		for(int j=back.length-1; j>=0; j--) {
        			sb.append(back[j]).append(" ");
        		}
        		
        		isFirst = false;
        		break;
        	}
        }
        
        if(sb.length()==0) {
        	sb.append("-1");
        }
        
        System.out.println(sb.toString());
        
	}

}
