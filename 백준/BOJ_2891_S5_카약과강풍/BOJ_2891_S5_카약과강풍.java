import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2891_S5_카약과강풍 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());

		int[] team = new int[N+2];
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<S; i++) {
			int no = Integer.parseInt(st.nextToken());
			team[no] = 1;
		}
		
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<R; i++) {
			int no = Integer.parseInt(st.nextToken());
			if(team[no]==1) {
				team[no] = 0;
			}
			else {
				team[no] = 2;
			}
		}
		
		int result = 0;
		for(int i=1; i<N+1; i++) {
			if(team[i] == 1) {
				if(team[i-1]==2) {
					team[i-1]=0;
					team[i]=0;
					continue;
				}
				else if(team[i+1]==2){
					team[i+1]=0;
					team[i]=0;
					continue;
				}
				result++;
			}
		}
		
		System.out.println(result);
	}

}
