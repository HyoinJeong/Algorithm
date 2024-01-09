package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ_2346_S3_풍선터뜨리기 {

	public static class Paper{
		int index;
		int value;
		
		public Paper(int index, int value) {
			this.index = index;
			this.value = value;
		}
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		Deque<Paper> dq = new ArrayDeque<>();
		for(int i=0; i<N; i++) {
			int no = Integer.parseInt(st.nextToken());
			dq.add(new Paper(i+1, no));
		}
		
		sb.append("1").append(" ");
		while(dq.size()>1) {
			Paper paper = dq.poll();
//			System.out.println(paper.value);
//			sb.append(paper.index).append(" ");
			
			if(paper.value>0) {
				for(int i=0; i<paper.value-1; i++) {
					Paper temp = dq.poll();
					dq.add(temp);
				}
				paper = dq.poll();
				sb.append(paper.index).append(" ");
				dq.addFirst(paper);
			}
			else {
				for(int i=0; i<Math.abs(paper.value)-1; i++) {
					Paper temp = dq.pollLast();
					dq.addFirst(temp);
				}
				paper = dq.pollLast();
				sb.append(paper.index).append(" ");
				dq.addFirst(paper);
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
