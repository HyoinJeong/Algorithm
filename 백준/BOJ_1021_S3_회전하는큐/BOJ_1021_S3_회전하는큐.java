package algo2024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1021_S3_회전하는큐 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
        	list.add(i);
        }
        
        // 1 2 3 4 5
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++) {
        	int no = Integer.parseInt(st.nextToken());
        	int index = list.indexOf(no);
        	
        	if(index>list.size()/2) { // 오른쪽으로 한칸 이동
        		for(int j=0; j<list.size()-index; j++) {
        			int temp = list.get(list.size()-1);
        			list.remove(list.size()-1);
        			list.add(0, temp);
        			result++;
        		}
        	}
        	else {
        		for(int j=0; j<index; j++) {
        			int temp = list.get(0);
        			list.remove(0);
        			list.add(list.size(), temp);
        			result++;
        		}
        	}
        	list.remove(0);
        }
        
        System.out.println(result);
	}

}
